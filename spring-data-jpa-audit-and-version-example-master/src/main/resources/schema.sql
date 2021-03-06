create table USER (
	USER_ID identity primary key,
	NAME varchar not null,
	VERSION BIGINT,
	CREATED_DATE TIMESTAMP,
	LAST_MODIFIED_DATE TIMESTAMP,
	CREATED_BY_USER_ID BIGINT,
	LAST_MODIFIED_BY_USER_ID BIGINT,
	constraint USER_CREATED_BY_USER foreign key (CREATED_BY_USER_ID) references USER (USER_ID),
	constraint USER_LAST_MODIFIED_BY_USER foreign key (LAST_MODIFIED_BY_USER_ID) references USER (USER_ID)
);

create table FOO (
	FOO_ID identity primary key,
	DATA varchar not null,
	VERSION BIGINT,
	CREATED_DATE TIMESTAMP,
	LAST_MODIFIED_DATE TIMESTAMP,
	CREATED_BY_USER_ID BIGINT,
	LAST_MODIFIED_BY_USER_ID BIGINT,
	constraint FOO_CREATED_BY_USER foreign key (CREATED_BY_USER_ID) references USER (USER_ID),
	constraint FOO_LAST_MODIFIED_BY_USER foreign key (LAST_MODIFIED_BY_USER_ID) references USER (USER_ID)
);

