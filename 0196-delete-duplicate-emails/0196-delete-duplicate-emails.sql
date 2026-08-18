with duplicates as(
    select id,
    Row_number() over (partition by email Order by id) as row_nums
    from Person
)
delete from Person
where id in(
    Select id from duplicates 
    where row_nums>1
);
