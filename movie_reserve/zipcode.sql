create table zipcode (
	id		number(5)	primary key,
	zipcode	varchar2(7),
	sido	varchar2(6),
	gugun	varchar2(21),
	dong	varchar2(36),
	ri		varchar2(60),
	bunji	varchar2(60)
);

SELECT substr(zipcode, 1, 3) AS zipcode1,
	   substr(zipcode, 5, 3) AS zipcode2,
	   trim(sido || ' ' || gugun || ' ' || dong || ' ' ||
	   ri || ' ' || bunji) AS addr1
FROM zipcode
WHERE dong like '%구로%';