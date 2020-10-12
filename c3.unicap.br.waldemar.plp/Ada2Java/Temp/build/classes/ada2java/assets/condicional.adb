with Ada.Text_IO; use Ada.Text_IO;
with Ada.Integer_Text_IO; use Ada.Integer_Text_IO;


procedure condicional is
   N: Integer;
begin
   Put("Entre com um valor inteiro: ");
   Get(N);
   if N > 0 then
      Put (N); -- coloca o inteiro
      Put_Line(" é um número positivo");
   end if;
end condicional;
