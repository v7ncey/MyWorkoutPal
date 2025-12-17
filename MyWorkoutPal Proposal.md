MyWorkoutPal

Team Members: Jordan, Alex, Vince Category: Healthcare / Fitness App

1. PROBLEM STATEMENT:
   
Many beginner-to-intermediate gym-goers want to work out consistently but struggle to know how to structure their routine—what muscles to train, how often to rest, and what to do on a given day. This uncertainty leads to wasted time, poor recovery, and eventual loss of motivation. MyWorkoutPal addresses this problem by generating a clear, personalized workout plan without requiring a personal trainer.

3. SOLUTION:
   
MyWorkoutPal is a Java-based MVP workout generator that creates a personalized training plan from a short user questionnaire. Users input basic information such as age, weight, fitness goals, and desired workout frequency. The app automatically generates a weekly workout schedule with properly placed rest days, determines the correct workout for the current day using the system date and time, and provides warm-ups, muscle targets, and hydration guidance. A premium waitlist feature introduces future advanced personalization and analytics.

5. TARGET MARKET:
   
Beginner and intermediate fitness users, students, and busy individuals who want structure and clarity without hiring a coach. The target market includes U.S. gym members as well as home-gym and casual fitness users seeking guided routines.

7. WHY IT’S VALUABLE :
   
MyWorkoutPal eliminates the common friction point of “not knowing what to do today” by delivering a day-specific workout with rest-day awareness. This increases workout confidence, improves consistency, and encourages long-term fitness adherence.

9. HOW YOU’LL MAKE MONEY:
    
The app uses a freemium model: core workout generation is free, while a premium subscription unlocks advanced personalization, analytics, unlimited workout history, and access to live Pilates, Barre, HIIT, and Zumba classes with real instructors. Pricing and structure are benchmarked against competitors such as Fitbod and MyFitnessPal.

11. MVP FEATURES
* User intake (age, weight, email with validation, goals)
* Weekly workout schedule 
* Warm-ups and dynamic stretches before workouts
* Muscle-group-specific daily workouts (e.g., Cardio & Abs, Back & Biceps)
* Water intake recommendations (ounces and gallons)
* Premium subscription waitlist signup

7. TIMELINE & DIVISION OF WORK 
Days 1–2
* Group formation, project planning, and role assignment
Days 3–5
* Jordan & Alex: User input structure (weight, age, email, goals), email validation loop
* Vince: Weekly schedule logic and rest-day placement
* All: Initial exercise outputs
Days 6–7
* Internal testing and debugging
* Added premium waitlist feature and refined output formatting
Day 8
* User testing and feedback collection
Days 9–10
* Final testing, bug fixes, code cleanup, and documentation

8. TEAM ROLES & RESPONSIBILITIES (REQUIRED)

Vince – Lead Developer 
* Built weekly workout schedule logic
* Implemented correct rest-day insertion
* Determined today’s workout and next workout day using date/time logic
Jordan – User Input & Validation
* Designed user input structure (age, weight, email, goals)
* Implemented email validation loop
* Assisted with testing and usability feedback
Alex – Developer & Tester
* Co-developed user intake and validation logic
* Assisted with debugging and input edge cases
* Contributed to testing and documentation

All Team Members
* Implemented exercises, warm-ups, and muscle targeting
* Added water intake calculations
* Built premium waitlist feature and fake analytics output
* Final formatting and testing

9. VIABILITY: HOW WE PROVED THIS WORKS 
* 5 users tested the app
* Focus areas: clarity of workouts, rest-day placement, and daily flow
* All testers successfully generated workouts without errors
* Users understood their weekly schedule and daily workouts
* Analytics-style outputs provided realistic, motivating feedback
* MVP demonstrated functional value beyond theoretical design

10. SCALABILITY: ROADMAP FROM MVP TO 100K USERS (REQUIRED)
Phase 1 – MVP 
* Java console-based workout generator
* Early validation with small user group
* Premium waitlist collection
Phase 2 – Growth
* User accounts and workout history
* Advanced analytics and progressive overload
* Backend storage and authentication
Phase 3 – Scale
* Recovery-aware personalization
* Health app integrations
* Subscription-based revenue and live class partnerships

11. SOURCES & REFERENCES 
* Market research from Fitbod and MyFitnessPal
* User feedback from 5 pilot testers
* Previous Java labs (Scanner input, arrays, loops, LocalDateTime)
* Online Java references (Stack Overflow, documentation, tutorials)
