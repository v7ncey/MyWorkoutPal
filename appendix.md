. TEAM CONTRIBUTION  
Jordan \- Designed initial user input structure (weight, age, email, goals), created email validation loop, and handled user info collection.  
Alex \- Developed weekly schedule logic, including proper insertion of rest days and automatic determination of today’s workout and next workout day.
Vince \- Developed weekly schedule logic, including proper insertion of rest days and automatic determination of today’s workout and next workout day.  
All \- Implemented exercises, warm-ups, water intake calculation, premium waitlist feature, fake analytics output, and final output formatting.  
2\. JAVA CONCEPTS APPLIED

* Arrays & ArrayLists  
* UI  
* String methods  
* Polymorphism  
* Data types & variables  
* Time & Date API  
* Control Flow  
* Randomization

3\. CHALLENGES & SOLUTIONS

* Github: ran into a few issues trying to disperse the java file through GitHub and had to work separately. Once each portion was completed we conjoined all our work onto one file  
* Aligning weekly schedule with real-world workout distribution: Determining rest days and ensuring next workout skips them  
* Randomizing exercises and reps while keeping beginner-friendly:Used Random class for reps and implemented equipment-based conditional exercises.  
* Determining rest days and ensuring next workout skips them: Created separate arrays for weekFocus and isWorkoutDay; used a loop to find next actual workout day.

4\. PROJECT TIMELINE  
  \-  Days 1-2: Forming the group, project planning, assigning roles.

* Days 3-5: Built user input structure, weekly schedule logic, and added exercises   
* 6-7: Conducted internal testing and debugging, added  email validation, and premium waitlist feature.  
* Day 8: User testing and feedback  
* Day 9-10: Final testing, code cleanup, and documentation.

5\. HOW WE COLLABORATED  
   \- Communicated using discord daily

* Shared GitHub repository  
* Reviewed code between each other

6\. VIABILITY TESTING (new section)

* User Testing: 5 users tried the app, providing feedback on clarity, workout sequence, and rest day scheduling.  
* Feedback: Users noted confusion when rest days were in the middle of the week and requested visible daily warm-ups.  
* Changes Made: Adjusted schedule logic so rest days do not count in next workout calculation, added warm-ups display, and included water intake advice.  
* Proof of Viability: All testers completed workouts in the app without errors, understood the schedule, and could generate a plan tailored to goals. Output metrics like calories burned and volume score were provided as realistic guidance, demonstrating functional MVP beyond theoretical claims.

7\. CITATIONS & EXTERNAL RESOURCES 

* Market Research: Review of fitness apps like Fitbod, MyFitnessPal, and Apple Health for exercise scheduling and freemium models.  
* User  Notes: Feedback from 5 pilot users testing weekly plans and rest days.  
* Previous Labs: Java Scanner input handling, arrays, loops, and LocalDateTime usage.

8\. REFLECTIONS & LESSONS LEARNED

* Learned to combine simple Java constructs with slightly more advanced logic (arrays, dynamic schedules, time API).  
* Understanding the importance of user input  and handling edge cases like rest days in workout apps.  
* Appreciated how team collaboration with multiple roles.  
* Developed confidence in translating a project proposal into a working MVP.

