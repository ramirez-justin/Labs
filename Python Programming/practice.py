my_student = {'name' : 'Rolf Smith', 'grades' : [70, 88, 90, 99]}

def average_grade(student):
    return sum(student['grades']) / len(student['grades'])


class Student:
    def __init__(self, new_name, new_grades):
        self.name = new_name
        self.grades = new_grades
        
    def __repr__(self) -> str: #
        pass
    def __str__(self) -> str:
        pass

student_one = Student('Rolf Smith', [70, 88, 90, 99])


