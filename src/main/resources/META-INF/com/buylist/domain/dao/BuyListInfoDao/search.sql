select
   id
  ,user_id
  ,category
  ,item_name
  ,quantity
  ,is_buyed
  ,registered_date
  ,created_at
  ,updated_at
  ,hobby3
  ,hobby4
  ,hobby5
from user_info
where
  user_id = /*userId*/'1'
