with Ada.Text_IO; use Ada.Text_IO;
with Ada.Integer_Text_IO; use Ada.Integer_Text_IO;

procedure Check_Positive is
   N : Integer;
   F : Float;
   C : Character;
   B : Boolean;
begin 
   Put ("Enter an integer value: ");  -- Put a String
   Get (N);  --  Reads in an integer value
   Put_Line ("Value of Integer: " & N);  --  Put an Integer
   
end Check_Positive;
