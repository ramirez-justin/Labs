# Justin Ramirez

# Floyd-Warshall Algorithm(top-down)
def floyd_warshall_top_down(graph):
    n = len(graph)
    dist = [[float('inf')] * n for _ in range(n)]
    return dp(dist, graph, n)

def dp(dist, graph, n):
    for u in range(n):
        for v in range(n):
            if u == v:
                dist[u][v] = 0
            elif graph[u][v]:
                dist[u][v] = graph[u][v]
            fw(u, v, n - 1, dist)
    return dist

def fw(u, v, k, dist):
    if k < 0:
        return dist[u][v]
    if dist[u][v] > fw(u, k, k - 1, dist) + fw(k, v, k - 1, dist):
        dist[u][v] = fw(u, k, k - 1, dist) + fw(k, v, k - 1, dist)
    return dist[u][v]

# FLoyd-Warshall Algorithm(bottom-up)
def floyd_warshall_bottom_up(graph):
    n = len(graph)
    dist = [[float('inf')] * n for _ in range(n)]

    for u in range(n):
        for v in range(n):
            if u == v:
                dist[u][v] = 0
            elif graph[u][v]:
                dist[u][v] = graph[u][v]

    for k in range(n):
        for u in range(n):
            for v in range(n):
                if dist[u][v] > dist[u][k] + dist[k][v]:
                    dist[u][v] = dist[u][k] + dist[k][v]

    return dist

if __name__ == '__main__':
    graph = [[0, 3, 8, float('inf'), -4],
             [float('inf'), 0, float('inf'), 1, 7],
             [float('inf'), 4, 0, float('inf'), float('inf')],
             [2, float('inf'), -5, 0, float('inf')],
             [float('inf'), float('inf'), float('inf'), 6, 0]]

    print(floyd_warshall_top_down(graph))
    print(floyd_warshall_bottom_up(graph))
