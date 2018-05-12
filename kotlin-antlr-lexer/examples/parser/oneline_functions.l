fun mult0() <- mult2(5, 3);

fun mult1(x) <- mult2(5, x);

fun mult2(x, y) <- mult3(x, y);

write(mult0() + mult1(3) * mult2(42, 1));