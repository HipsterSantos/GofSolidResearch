package Gof.principles.module.observer.pattern.modules;

public @interface ProblemToFix {
    /*
    *Now let us directly enter into our simple example. Here I have created one observer (though you can create
more) and one subject. The subject maintains a list for all of its observers (though here we have only one
for simplicity). Our observer here wants to be notified when the flag value changes in the subject. With the
output, you will discover that the observer is getting the notifications when the flag value changed to 5 or
25. But there is no notification when the flag value changed to 50 because by this time the observer has
unregistered himself from the subject.
    * */
}
