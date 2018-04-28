fun foo(x, y) <- {
    ans := 0.0;
    while (x != true && y != false) do {
        ans := ans + 1;
        x := x && y;
        y := y || x;
    }
    if (ans >= 5.0) then {
        ans := ans - 4.9;
    }
    return ans;
}