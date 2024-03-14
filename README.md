# kata-legacy-code

Given the codevase under excelservice-1.0, you need to improve the existing code, which can be considered as legacy code. This codease was created ages ago, and nobody really knows who coded it or how it really works. Nonetheless, as the business changes frequently, classes has already been modified many times, messing the codevase structure and makit hard to understand at few places.

Today, once again, the PM wants to add some new stuff to it. But it became suddenly challenging, as it is already quite complex. Just adding a new behaviour in the expoert is tricky. So it won't work this time to just ignore the current debt.

Your mission, should you decide to accept it, is to **refactor the whole codebase to make it
understandable, and thus more maintainable by the next developer**. Now is the time for you to
show your exceptional skills and make this implementation better.

**The application is supposed to :**

- allow a user to create surveys
- allow a user to start a campaign based on a survey
- export an existing campaign and send it over by email

The objectives is to improve this codecase. This exercise **should not last longer than 1,5 hour** (but this can be too short to do it all and
you can take longer if you want).

## How to run the code

You can start the application:

```
mvn spring-boot:run
```

This will expose a few routes [at localhost](http://localhost:8080/`).

You can launch the tests with:

```
mvn test
```

## Deliverables

What do we expect from you:
- the link of the git repository
- several commits, with an explicit message each time
- a file / message / email explaining your process and principles you've followed

**Good luck!**
