
##  Data Structures Used

### HashMap
- Used for storing words and their frequency.
- Key → Word  
- Value → Frequency  

### ArrayList
- Used for storing sorted results while suggesting words.
- Displays suggestions to the user.

---

##  Adding Logic

- First, check if the HashMap already contains the word.
- If the word is present:
  - Display message: "Word already exists".
- If the word is not present:
  - Insert the word as the key.
  - Set frequency as value = 1.

---

##  Searching Logic (With Frequency Increase)

- If the word is present in the HashMap using `.containsKey()`:
  - Increase its frequency by 1.
- If the word is not present:
  - Display message: "Word not found".

---

## Suggestion Logic

- First, the system asks the user for:
  - A prefix string
  - A value `k` (maximum number of suggestions required)

- Add words into the ArrayList that start with the given prefix.
- Sort the ArrayList:
  - Sorting can be done using:
    - Nested loops (Selection Sort or other sorting algorithms), or
    - `Collections.sort()`
  - In this system, `Collections.sort()` is used because it has better time complexity.

- If `arrayList.size() > k`:
  - Print the sublist from index `0` to `k`.
- If size is not greater than `k`:
  - Print the entire list.

---

##  Run and Test

### Requirements
- Java 8+ must be installed on the system.

### Run Using IDE
- Open the project in any Java-supported IDE.
- Configure JDK.
- Run `Assignment.java`.

### Run Using Terminal

1. Go to the project folder path.
2. Compile the file:
