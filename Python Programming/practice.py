
movie_list = []

# Add new movies to my collection
def addMovie(movie_list):
    title = input("Enter the movie title: ")
    director = input("Enter the movie director: ")
    year = input("Enter the movie release year: ")

    movie_list.append({
        'title': title, 
        'director': director, 
        'year': year
    })

# List all Movies in my collectiong
def listMovies(movie_list):
    [printMovie(movie)for movie in movie_list]
         

# Find movie using movie title(search)
def findMovie(movie_list):
    user = input("Please enter title of the movie to search for: ")
    printMovie(movie_list.fromkeys('title', user))

# Prints Movies in nice format
def printMovie(movie):
    print(f"Title: {movie['title']}")
    print(f"Director: {movie['director']}")
    print(f"Year: {movie['year']}")

# Main Method
if __name__ == "__main__":
    menu_prompt = """\nPlease enter 'A' to add a movie to collection, 
            \n'L' to list all movies in collection, 
            \n'F' to search for a movie in the collection, 
            \nor 'Q' to quit: """
    
    user = input(menu_prompt)
    while user != 'Q':
        if user == 'A':
            addMovie(movie_list)
        elif user == 'L':
            listMovies(movie_list)
        elif user == 'F':
            findMovie(movie_list)
        else:
            print("Unknown command used. Please enter a proper command.")
        user = input(menu_prompt)

