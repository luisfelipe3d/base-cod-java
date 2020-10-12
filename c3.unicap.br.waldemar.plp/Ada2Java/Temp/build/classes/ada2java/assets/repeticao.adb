with Ada.Text_IO; use Ada.Text_IO;
with Ada.Integer_Text_IO; use Ada.Integer_Text_IO;

procedure repeticao is
   
begin
   for I in 1 .. 5 loop
      Put_Line("Ola, mundo! " & Integer'Image (I));
   end loop;
   Put_Line("");
   for I in reverse 1 .. 5 loop
      Put_Line("Ola, mundo2! " & Integer'Image (I));
   end loop;
   
   
end repeticao;
