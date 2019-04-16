# in-place selection sort

Rearrange
an unordered `ArrayList<Integer>`
and use it as the data in an `OrderedList_inArraySlots`.

The re-use is probably contrary to Java's conventions
for its built-in classes. But as a pedagogical tool,
it has the advantage of allowing
the User program to check that the sort
is done in-place.

## count the cost

0. If the number of the elements in the input triples,
the time required to run the reigning champ algorithm
will grow by 2n, which is the difference between 3n (triple the inputs) and n (the original number of inputs) The time required to run the reigning champ algorithm grows in linear time because the number of invocations is directly related to the number of elements in the input as seen in the for loop.

0. If the number of the elements in the input triples,
the number of times that the reigning champ algorithm
will be invoked will grow by 2n for the same reason the time required increases. It is linear growth again because the number of times that the reigning champ algorithm is invoked is the number of elements in the input.

0. If the number of the elements in the input triples,
the time required for the selection sort will grow by 2n. The selection sort algorithm relies on a for loop which iterates through each element in the input and thus the growth is linear.