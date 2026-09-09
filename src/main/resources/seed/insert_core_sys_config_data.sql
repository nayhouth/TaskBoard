INSERT INTO core_sys_config (
    config_group,
    config_key,
    config_value,
    description,
    active
)
VALUES (
           'CORS',
           'ALLOWED_ORIGINS',
           '["http://localhost:5173"]'::jsonb,
           'Allowed CORS origins',
           'Y'
       );