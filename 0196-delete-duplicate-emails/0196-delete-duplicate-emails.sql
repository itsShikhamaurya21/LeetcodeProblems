with ranked as(
    select id,
    ROW_NUMBER() OVER(PARTITION by email ORDER BY id) as rank_num
    From Person
)
Delete from Person
where id in(
    Select id 
    from ranked 
    where rank_num>1
);
