DELIMITER //
CREATE Procedure GETAGEPROCEDURE(IN empID int(10), OUT name varchar (40))
BEGIN
select name from emp where id= empID;
END ;
//