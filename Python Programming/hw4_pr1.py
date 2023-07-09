# Justin Ramirez
def game21_top_down(deck):
    n = len(deck)
    dp = [-1 for _ in range(n+5)]

    def solve(i):
        if i >= n or n-i < 4:
            return 0
        if dp[i] != -1:
            return dp[i]

        dealer = deck[i] + deck[i+1]
        player_4 = deck[i+2] + deck[i+3]
        player_5 = player_4 + deck[i+4]

        dp[i] = solve(i+4)
        if dealer < player_4 <= 21:
            dp[i] = max(dp[i], 1 + solve(i+4))
        if dealer < player_5 <= 21 and n-i >= 5:
            dp[i] = max(dp[i], 1 + solve(i+5))

        return dp[i]

    return solve(0)



def game21_bottom_up(deck):
    n = len(deck)
    dp = [0 for _ in range(n+5)]

    for i in range(n-4, -1, -1):  # Ensure there are enough cards for a round
        dealer = deck[i] + deck[i+1]
        player_4 = deck[i+2] + deck[i+3]
        player_5 = player_4
        if n-i >= 5:  # Check if the player can draw an extra card
            player_5 += deck[i+4]

        dp[i] = dp[i+4]
        if dealer < player_4 <= 21:
            dp[i] = max(dp[i], 1 + dp[i+4])
        if dealer < player_5 <= 21 and n-i >= 5:
            dp[i] = max(dp[i], 1 + dp[i+5])

    return dp[0]


deck1 = [1, 1, 1, 8, 10, 3, 5, 3, 2, 4, 2]  # example 1 deck
deck2 = [3, 3, 2, 1, 2, 10, 1, 5, 1, 10, 7, 1, 1, 2, 3, 4] # example 2 deck
deck3 = [4, 3, 2, 5, 1, 3, 3, 2, 1, 2, 10, 1, 5, 1, 10, 7, 1, 1, 2, 3, 4]

print(game21_top_down(deck1))
print(game21_bottom_up(deck2))
print(game21_bottom_up(deck3))

