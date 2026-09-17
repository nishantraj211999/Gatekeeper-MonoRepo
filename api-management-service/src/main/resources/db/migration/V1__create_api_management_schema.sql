CREATE TABLE organizations(id BIGINT NOT NULL AUTO_INCREMENT,
                           name VARCHAR(150) NOT NULL,
                           slug VARCHAR(100)NOT NULL,
                           status VARCHAR(20)Not NULL,
                           created_at DATETIME(6)Not NULL,
                           updated_at DATETIME(6)Not NULL,
                           deleted_at DATETIME(6),
                           CONSTRAINT pk_organizations PRIMARY KEY(id),
                           CONSTRAINT uk_organizations_name UNIQUE(name),
                           CONSTRAINT uk_organizations_slug UNIQUE(slug)
);
