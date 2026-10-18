# Great Library Kata

This Kata consists in implementing the search engine of a great library: books are added to it, then the books containing a given word can be found.

---

## 🎯 Step 1: Adding Books and Searching by Word

I want to be able to:
- **Add** a book to the library.
- **Search** for all the books containing a given word.

The words of a book are separated by spaces. If no book contains the word, the search returns an empty list.

### Examples:

Library:

| Title | Content |
|---|---|
| The Little Prince | `a stranded pilot meets the little prince from another planet` |
| Moby Dick | `captain Ahab hunts the white whale across every ocean` |
| The Count of Monte Cristo | `a betrayed sailor escapes prison and plans his revenge` |

Searches:

| Searched word | Result |
|---|---|
| `whale` | `[Moby Dick]` |
| `the` | `[The Little Prince, Moby Dick]` |
| `a` | `[The Little Prince, The Count of Monte Cristo]` |
| `revenge` | `[The Count of Monte Cristo]` |
| `dragon` | `[]` |
