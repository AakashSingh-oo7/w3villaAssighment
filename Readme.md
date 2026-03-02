#Data structures used
    ##hashmap = for storing words and frequency
    ##arraylist = for storing sorted result while suggesting words and showing as suggetions


#adding logic
   ##first check if hashmap already has the word if word present just say already exists
   ##if word is not present put word in key and frequency in value as 1

#searching logic with frequency increase
    ##if word is present in hashmap (.containKey()) then increase the frequency 
    ##if word not present just say not found

#suggestion logic
    ##first system ask you about some prefix and k = which mean at most how many suggeston user want to see
    ##add words in the arraylist which start with string present in prefix
    ##sort the arraylist 
        for sorting we can use two methods using nested loop(selection sort or any sorting allgorithum)
        using collection.sort 
        for this system we used collection.sort because it has less time complexity
    ##if arraylist size > k after sorting print sublist until then k
    ##if size is not > k then just print list

#run and test
    ##java 8+ version must be installed on system
    ##use any ide which support java
    ##configure and then run
           # or
    ##just go at the path of file
    ##type javac Assignment.java  and hit enter
    then java Assighment


    

    
