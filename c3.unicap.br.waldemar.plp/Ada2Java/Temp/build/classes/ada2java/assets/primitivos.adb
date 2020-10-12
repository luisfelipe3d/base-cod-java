with Ada.Text_IO; use Ada.Text_IO;
with Ada.Strings; use Ada.Strings;
with Ada.Strings.Unbounded; use Ada.Strings.Unbounded;
with Ada.Integer_Text_IO; use Ada.Integer_Text_IO;


procedure primitivos is
   name: String(1 .. 10);

begin
   Put_Line("Digite seu nome: ");
   Get(name);
   Put_line(name);
end primitivos;
