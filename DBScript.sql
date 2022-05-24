
CREATE TABLE [settings] (
  [setting_id] int primary key identity(1,1),
  [name] nvarchar(31),
  [description] ntext,
  [type] varchar(50),
  [value] varchar(50),
  [order] varchar(50),
  [status] int
);

CREATE TABLE [product_categories] (
  [category_id] int primary key identity(1,1),
  [category_name] varchar(100),
  [description] varchar(255),
  [status] int
);

CREATE TABLE [products] (
  [product_id] int primary key identity(1,1),
  [title] varchar(255),
  [category_id] int,
  [unit_in_stock] int,
  [original_price] money,
  [sale_price] money,
  [product_details] varchar(255),
  [featured] bit,
  [status] int,
  CONSTRAINT [FK_product.category_id] FOREIGN KEY ([category_id]) REFERENCES [product_categories]([category_id])
);

CREATE TABLE [product_images] (
  [image_id] int primary key identity(1,1),
  [product_id] int,
  [url] varchar(255),
  [description] varchar(255),
  CONSTRAINT [FK_product_image.product_id] FOREIGN KEY ([product_id]) REFERENCES [products]([product_id])
);

CREATE TABLE [roles] (
  [role_id] int primary key identity(1,1),
  [role_name] nvarchar(255)
);
CREATE TABLE [screens] (
  [screen_id] int primary key,
  [screen_name] nvarchar(255)
);

CREATE TABLE [permissions](
  [role_id] int,
  [screen_id] int,
  [activity_id] int,
  CONSTRAINT [FK_permissions.roles] FOREIGN KEY ([role_id]) REFERENCES [roles]([role_id]),
  CONSTRAINT [FK_permissions.screens] FOREIGN KEY ([screen_id]) REFERENCES [screens]([screen_id])
);


CREATE TABLE [accounts] (
  user_id int primary key identity(1,1),
  username varchar(255),
  password varchar(255),
  full_name nvarchar(255),
  role_id int,
  gender bit,
  email varchar(255),
  city nvarchar(255),
  country nvarchar(255),
  address nvarchar(255),
  phone varchar(15),
  image_url varchar(255),
  featured bit,
  CONSTRAINT [FK_account.role_id] FOREIGN KEY ([role_id]) REFERENCES [roles]([role_id])
);
CREATE TABLE [orders] (
  [order_id] int primary key identity(1,1),
  [user_id] int,
  [order_date] datetime,
  [require_date] datetime,
  [shipped_date] datetime,
  [ship_via] int,
  [freight] money,
  [ship_name] nvarchar(255),
  [ship_address] nvarchar(255),
  [ship_gender] bit,
  [ship_mobile] varchar(15),
  [ship_email] varchar(255),
  [status] int,
  [total_price] money,
  CONSTRAINT [FK_orders.user_id] FOREIGN KEY ([user_id]) REFERENCES [accounts]([user_id])
);

CREATE TABLE [general_feedbacks] (
  [feedback_id] int primary key identity(1,1),
  [user_id] int,
  [star] int,
  [feedback_contents] ntext,
  [status] int,
  CONSTRAINT [FK_general_feedbacks.user_id] FOREIGN KEY ([user_id]) REFERENCES [accounts]([user_id])
);

CREATE TABLE [sliders] (
  [slider_id] int primary key identity(1,1),
  [slider_image] text,
  [title] nvarchar(250),
  [slider_link] text,
  [status] int
);

CREATE TABLE [post_categories] (
  [category_id] int primary key identity(1,1),
  [category_name] nvarchar(255),
  [description] ntext,
  [status] int
);

CREATE TABLE [posts] (
  [post_id] int primary key identity(1,1),
  [user_id] int,
  [title] nvarchar(511),
  [updated_date] datetime,
  [category_id] int,
  [post_details] ntext,
  [featured] bit,
  CONSTRAINT [FK_posts.category_id] FOREIGN KEY ([category_id]) REFERENCES [post_categories]([category_id]),
  CONSTRAINT [FK_posts.user_id] FOREIGN KEY ([user_id]) REFERENCES [accounts]([user_id])
);

CREATE TABLE [product_feedbacks] (
  [feedback_id] int primary key identity(1,1),
  [user_id] int,
  [product_id] int,
  [star] float,
  [feedbacks_content] ntext,
  CONSTRAINT [FK_product_feedbacks.product_id] FOREIGN KEY ([product_id]) REFERENCES [products]([product_id])
);

CREATE TABLE [order_details] (
  [order_id] int,
  [product_id] int,
  [quantity] int,
  CONSTRAINT PK_Order_Details primary key ([order_id], [product_id]),
  CONSTRAINT [FK_order_details.product_id] FOREIGN KEY ([product_id]) REFERENCES [products]([product_id]),
  CONSTRAINT [FK_order_details.order_id] FOREIGN KEY ([order_id]) REFERENCES [orders]([order_id])
);
CREATE TABLE [orders_management] (
  [order_id] int,
  [user_id] int,
  CONSTRAINT PK_Order_Sale PRIMARY KEY ([order_id],[user_id]),
  CONSTRAINT [FK_orders_sales.order_id] FOREIGN KEY ([order_id]) REFERENCES [orders]([order_id]),
  CONSTRAINT [FK_order_sales.user_id] FOREIGN KEY ([user_id]) REFERENCES [accounts]([user_id])
);
