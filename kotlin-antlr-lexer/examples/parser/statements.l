read(x);
while x <= 5 do {
    y := x / 2;
    if y % 2 == 0 then {
        write(y);
        x := x + 2;
    } else {
        write(y + 1);
        x := x + 1;
    }
}