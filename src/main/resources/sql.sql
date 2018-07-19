CREATE TABLE IF NOT EXISTS t_sys_user_roles (
  user_id int(11) NOT NULL,
  role_id int(11) NOT NULL,
  PRIMARY KEY (user_id, role_id))
ENGINE = InnoDB
COMMENT = '用户角色关联表';


CREATE TABLE IF NOT EXISTS t_sys_role_resources (
  role_id int(11) NOT NULL,
  resource_id int(11) NOT NULL,
  PRIMARY KEY (role_id, resource_id))
ENGINE = InnoDB
COMMENT = '角色资源关联表';