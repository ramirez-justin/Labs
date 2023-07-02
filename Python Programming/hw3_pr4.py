# Justin Ramirez

def max_tasks(tasks, t):
    # Sort tasks in ascending order
    tasks.sort()
    
    # Initialize total time and task counter
    total_time, task_count = 0, 0
    
    for task in tasks:
        if total_time + task <= t:
            total_time += task
            task_count += 1
        else:
            break  # Stop when next task can't be done within time limit

    return task_count

# Test the function
print(max_tasks([4, 2, 3, 1, 5], 7))  # Returns: 3
