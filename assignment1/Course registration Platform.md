# Course registration Platform


## Objects and Behaviour

* Computer:
State: Processorname, ModelNo
Behaviour: isWorking(), restart()

* Internet:
State: IPAdress, InternetType
Behaviour: Connect(), isAvailable() , retry()

* Website:
State: URL
Behaviour: login(), logout()

* Student:
State: name, age, studentId, password
Behaviour: list browseCourses(),  registerCourse(), resheduleCourses(), dropCourse() 

* Course:
State: courseName, CourseDuration, StartDate, EndDate, 
Behavior: register(),drop()
     
* Account:
State: tutionFee, balance 
Behaviour: pay() , confirm(), int getBalance()


## Pseudo code to register and drop a course:

*a) Student registers for a course*

```
Course Java= new Course;       //object creation
Student Amisha= new Student()
Amisha.registerCourse(Course Java)   //Amisha register for java course 
if-->Computer:Windows10.connect()
      else retry()
 if(Internet.isAvailable(URL))
      else retry()                                       // check for internet availibility  
Website.login(StudentID, password)
list browseCourse()
course.register(java);                            //register for java course             
duebalance = Account.getBalance()
If duebalance>0 then tutionfee=duebalance+tutionfee; // check for due tutionfee
Account.pay(tutionfee)--->confirm()
website.logout()                                      // paid and logged out
else:
   retry()
```

*b) Student drops a course*


```
Student John;
Course Database;
 John.dropCourse(Database)  //John drops course
  Computer.connect()
  if(Internet.isAvailable())
    Website.login(ID, Pwd)
    list browseCourse()
    course.drop(CourseNAme);   // browse course and drop   
  else:
    retry(); 
 ```
