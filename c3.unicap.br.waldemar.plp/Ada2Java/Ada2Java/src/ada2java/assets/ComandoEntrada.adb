with Ada.Text_IO; use Ada.Text_IO;
with Ada.Integer_Text_IO; use Ada.Integer_Text_IO;

procedure Check_Positive is
    N : Integer;
begin
    Put_Line ("Enter an integer value: ");
    Get (N);
    if N > 0 then
        Put_Line (N);
        Put_Line (" is a positive number");
    end if;
end Check_Positive;

