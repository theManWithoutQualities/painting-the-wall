# painting-the-wall
Solution for task B in RCC 2017

Time limit 	2 seconds
Memory limit 	256 megabytes

Little girl Masha is looking at the wall in her room. The wall is tiled with square tiles, but some of the tiles are replaced with lamps. So it is possible to consider the wall to be a rectangle of n × m, some cells contain tiles, other cells contain lamps.

Masha has paints of k different colors. Consider continuous vertical or horizontal segments of tiles, having an edge of the wall or a lamp at each of its ends. Masha wants to paint all tiles in such way, that any such segment has all tiles painted in different colors. Masha will not paint lamps. She doesn't have to use all the colors.

Help Masha to paint the wall.
 
Input format 	

Input contains several test cases. The first line contains the number of test cases t.

Each test case is described by several lines. The first line contains three integers: n, m, k (1 ≤ n, m ≤ 100, 1 ≤ k ≤ max(n, m)) — the size of the wall and the number of paints Masha has.

The following n lines contain m integers aij each:

    aij = 0 means that the position (i, j) contains the lamp;
    aij = 1 means that the position (i, j) contains the tile. 

The total number of tiles and lamps in all test cases of one input doesn't exceed 105.
Output format 	

For each test case first print the answer:

    NO, if there is no way to paint the wall.
    YES, if there is at least one way to paint the wall. In this case the following n lines must contain m integers bij each — the color of the tile at position (i, j), or 0, if there is a lamp at this position. If there are several ways to paint the wall, you can output any one. 
