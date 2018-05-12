fun mult0() {
    return mult2(5, 3);
}

fun mult1(x) {
    return mult2(5, x);
}

fun mult2(x, y) {
    return mult3(x, y);
}

write(mult0() + mult1(3) * mult2(42, 1));