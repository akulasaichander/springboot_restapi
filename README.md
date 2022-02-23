
courses api

GET
/courses    ------gets all the courses
/courses/courseId- get course with id

POST
/addCourse
  BODY
  {
        "id": 130,
        "description": "cotains spring mvc Spring boot framework info",
        "name": "Spring mvc and Spring boot",
        "price": 500
   }

PUT
/updateCourse
BODY
  {
        "id": 130,
        "description": "cotains spring mvc Spring boot framework info",
        "name": "Spring mvc and Spring boot",
        "price": 100
   }


DELETE
deleteCourse/courseId

