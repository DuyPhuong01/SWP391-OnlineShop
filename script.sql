USE [master]
GO
/****** Object:  Database [SWP391]    Script Date: 5/25/2022 11:20:08 PM ******/
CREATE DATABASE [SWP391]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'SWP391', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\SWP391.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'SWP391_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\SWP391_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [SWP391] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [SWP391].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [SWP391] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [SWP391] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [SWP391] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [SWP391] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [SWP391] SET ARITHABORT OFF 
GO
ALTER DATABASE [SWP391] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [SWP391] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [SWP391] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [SWP391] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [SWP391] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [SWP391] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [SWP391] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [SWP391] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [SWP391] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [SWP391] SET  ENABLE_BROKER 
GO
ALTER DATABASE [SWP391] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [SWP391] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [SWP391] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [SWP391] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [SWP391] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [SWP391] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [SWP391] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [SWP391] SET RECOVERY FULL 
GO
ALTER DATABASE [SWP391] SET  MULTI_USER 
GO
ALTER DATABASE [SWP391] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [SWP391] SET DB_CHAINING OFF 
GO
ALTER DATABASE [SWP391] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [SWP391] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [SWP391] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [SWP391] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'SWP391', N'ON'
GO
ALTER DATABASE [SWP391] SET QUERY_STORE = OFF
GO
USE [SWP391]
GO
/****** Object:  Table [dbo].[accounts]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[accounts](
	[user_id] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](255) NULL,
	[password] [varchar](255) NULL,
	[full_name] [nvarchar](255) NULL,
	[role_id] [int] NULL,
	[gender] [bit] NULL,
	[email] [varchar](255) NULL,
	[city] [nvarchar](255) NULL,
	[country] [nvarchar](255) NULL,
	[address] [nvarchar](255) NULL,
	[phone] [varchar](15) NULL,
	[image_url] [varchar](255) NULL,
	[featured] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[user_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[general_feedbacks]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[general_feedbacks](
	[feedback_id] [int] IDENTITY(1,1) NOT NULL,
	[user_id] [int] NULL,
	[star] [int] NULL,
	[feedback_contents] [ntext] NULL,
	[status] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[feedback_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[order_details]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[order_details](
	[order_id] [int] NOT NULL,
	[product_id] [int] NOT NULL,
	[quantity] [int] NULL,
 CONSTRAINT [PK_Order_Details] PRIMARY KEY CLUSTERED 
(
	[order_id] ASC,
	[product_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[orders]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[orders](
	[order_id] [int] IDENTITY(1,1) NOT NULL,
	[user_id] [int] NULL,
	[order_date] [datetime] NULL,
	[require_date] [datetime] NULL,
	[shipped_date] [datetime] NULL,
	[ship_via] [int] NULL,
	[freight] [money] NULL,
	[ship_name] [nvarchar](255) NULL,
	[ship_address] [nvarchar](255) NULL,
	[ship_gender] [bit] NULL,
	[ship_mobile] [varchar](15) NULL,
	[ship_email] [varchar](255) NULL,
	[status] [int] NULL,
	[total_price] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[order_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[orders_management]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[orders_management](
	[order_id] [int] NOT NULL,
	[user_id] [int] NOT NULL,
 CONSTRAINT [PK_Order_Sale] PRIMARY KEY CLUSTERED 
(
	[order_id] ASC,
	[user_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[permissions]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[permissions](
	[role_id] [int] NULL,
	[screen_id] [int] NULL,
	[activity_id] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[post_categories]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[post_categories](
	[category_id] [int] IDENTITY(1,1) NOT NULL,
	[category_name] [nvarchar](255) NULL,
	[description] [ntext] NULL,
	[status] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[category_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[posts]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[posts](
	[post_id] [int] IDENTITY(1,1) NOT NULL,
	[user_id] [int] NULL,
	[title] [nvarchar](511) NULL,
	[thumbnail] [text] NULL,
	[updated_date] [datetime] NULL,
	[category_id] [int] NULL,
	[post_details] [ntext] NULL,
	[featured] [bit] NULL,
 CONSTRAINT [PK__posts__3ED78766A39437E4] PRIMARY KEY CLUSTERED 
(
	[post_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product_categories]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product_categories](
	[category_id] [int] IDENTITY(1,1) NOT NULL,
	[category_name] [varchar](100) NULL,
	[description] [varchar](255) NULL,
	[status] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[category_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product_feedbacks]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product_feedbacks](
	[feedback_id] [int] IDENTITY(1,1) NOT NULL,
	[user_id] [int] NULL,
	[product_id] [int] NULL,
	[star] [float] NULL,
	[feedbacks_content] [ntext] NULL,
PRIMARY KEY CLUSTERED 
(
	[feedback_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product_images]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product_images](
	[image_id] [int] IDENTITY(1,1) NOT NULL,
	[product_id] [int] NULL,
	[url] [varchar](255) NULL,
	[description] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[image_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[products]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[products](
	[product_id] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](255) NULL,
	[category_id] [int] NULL,
	[unit_in_stock] [int] NULL,
	[updated_date] [datetime] NULL,
	[original_price] [money] NULL,
	[sale_price] [money] NULL,
	[product_details] [ntext] NULL,
	[featured] [bit] NULL,
	[status] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[product_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[roles]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[roles](
	[role_id] [int] IDENTITY(1,1) NOT NULL,
	[role_name] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[role_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[screens]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[screens](
	[screen_id] [int] NOT NULL,
	[screen_name] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[screen_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[settings]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[settings](
	[setting_id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](31) NULL,
	[description] [ntext] NULL,
	[type] [varchar](50) NULL,
	[value] [varchar](50) NULL,
	[order] [varchar](50) NULL,
	[status] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[setting_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[sliders]    Script Date: 5/25/2022 11:20:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sliders](
	[slider_id] [int] IDENTITY(1,1) NOT NULL,
	[slider_image] [text] NULL,
	[title] [nvarchar](250) NULL,
	[slider_link] [text] NULL,
	[status] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[slider_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[accounts] ON 

INSERT [dbo].[accounts] ([user_id], [username], [password], [full_name], [role_id], [gender], [email], [city], [country], [address], [phone], [image_url], [featured]) VALUES (1, N'phuong', N'15102001', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[accounts] ([user_id], [username], [password], [full_name], [role_id], [gender], [email], [city], [country], [address], [phone], [image_url], [featured]) VALUES (2, N'phuong2', N'15102001', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[accounts] ([user_id], [username], [password], [full_name], [role_id], [gender], [email], [city], [country], [address], [phone], [image_url], [featured]) VALUES (3, N'quangtv', N'071001', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[accounts] ([user_id], [username], [password], [full_name], [role_id], [gender], [email], [city], [country], [address], [phone], [image_url], [featured]) VALUES (4, N'dungba', N'111111', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[accounts] ([user_id], [username], [password], [full_name], [role_id], [gender], [email], [city], [country], [address], [phone], [image_url], [featured]) VALUES (5, N'toanpv', N'111111', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)
SET IDENTITY_INSERT [dbo].[accounts] OFF
GO
INSERT [dbo].[order_details] ([order_id], [product_id], [quantity]) VALUES (1, 7, 1)
INSERT [dbo].[order_details] ([order_id], [product_id], [quantity]) VALUES (2, 7, 1)
INSERT [dbo].[order_details] ([order_id], [product_id], [quantity]) VALUES (3, 7, 1)
INSERT [dbo].[order_details] ([order_id], [product_id], [quantity]) VALUES (4, 7, 1)
INSERT [dbo].[order_details] ([order_id], [product_id], [quantity]) VALUES (5, 7, 1)
GO
SET IDENTITY_INSERT [dbo].[orders] ON 

INSERT [dbo].[orders] ([order_id], [user_id], [order_date], [require_date], [shipped_date], [ship_via], [freight], [ship_name], [ship_address], [ship_gender], [ship_mobile], [ship_email], [status], [total_price]) VALUES (1, 1, CAST(N'2022-05-25T23:09:53.303' AS DateTime), NULL, NULL, NULL, 20000.0000, NULL, N'Đ?i H?c FPT-Hà N?i', NULL, N'0783332391', N'phuong@gmail.com', 1, 28990000.0000)
INSERT [dbo].[orders] ([order_id], [user_id], [order_date], [require_date], [shipped_date], [ship_via], [freight], [ship_name], [ship_address], [ship_gender], [ship_mobile], [ship_email], [status], [total_price]) VALUES (2, 2, CAST(N'2022-05-25T23:09:53.307' AS DateTime), NULL, NULL, NULL, 20000.0000, NULL, N'Đ?i H?c FPT-Hà N?i', NULL, N'0783332391', N'phuong2@gmail.com', 1, 28990000.0000)
INSERT [dbo].[orders] ([order_id], [user_id], [order_date], [require_date], [shipped_date], [ship_via], [freight], [ship_name], [ship_address], [ship_gender], [ship_mobile], [ship_email], [status], [total_price]) VALUES (3, 3, CAST(N'2022-05-25T23:09:53.307' AS DateTime), NULL, NULL, NULL, 20000.0000, NULL, N'Đ?i H?c FPT-Hà N?i', NULL, N'0783332391', N'quang@gmail.com', 1, 28990000.0000)
INSERT [dbo].[orders] ([order_id], [user_id], [order_date], [require_date], [shipped_date], [ship_via], [freight], [ship_name], [ship_address], [ship_gender], [ship_mobile], [ship_email], [status], [total_price]) VALUES (4, 4, CAST(N'2022-05-25T23:09:53.307' AS DateTime), NULL, NULL, NULL, 20000.0000, NULL, N'Đ?i H?c FPT-Hà N?i', NULL, N'0783332391', N'dung@gmail.com', 1, 28990000.0000)
INSERT [dbo].[orders] ([order_id], [user_id], [order_date], [require_date], [shipped_date], [ship_via], [freight], [ship_name], [ship_address], [ship_gender], [ship_mobile], [ship_email], [status], [total_price]) VALUES (5, 5, CAST(N'2022-05-25T23:09:53.307' AS DateTime), NULL, NULL, NULL, 20000.0000, NULL, N'Đ?i H?c FPT-Hà N?i', NULL, N'0783332391', N'toan@gmail.com', 1, 28990000.0000)
SET IDENTITY_INSERT [dbo].[orders] OFF
GO
SET IDENTITY_INSERT [dbo].[post_categories] ON 

INSERT [dbo].[post_categories] ([category_id], [category_name], [description], [status]) VALUES (1, N'Technology', N'this is news about technology', 1)
INSERT [dbo].[post_categories] ([category_id], [category_name], [description], [status]) VALUES (2, N'Technology', N'this is news about technology', 1)
SET IDENTITY_INSERT [dbo].[post_categories] OFF
GO
SET IDENTITY_INSERT [dbo].[posts] ON 

INSERT [dbo].[posts] ([post_id], [user_id], [title], [thumbnail], [updated_date], [category_id], [post_details], [featured]) VALUES (1, 1, N'This is first post', N'images/post-thumbnails/5f9c9cba740569d1a4ca33db.jpg', CAST(N'2022-05-25T01:19:24.863' AS DateTime), 1, N'This is post details', 1)
INSERT [dbo].[posts] ([post_id], [user_id], [title], [thumbnail], [updated_date], [category_id], [post_details], [featured]) VALUES (2, 2, N'This is second post', N'images/post-thumbnails/abc.jpg', CAST(N'2022-05-25T01:20:51.563' AS DateTime), 1, N'This is second post details', 1)
INSERT [dbo].[posts] ([post_id], [user_id], [title], [thumbnail], [updated_date], [category_id], [post_details], [featured]) VALUES (3, 1, N'This is third post', N'images/post-thumbnails/def.jpg', CAST(N'2022-05-25T01:21:06.420' AS DateTime), 1, N'This is third post details', 1)
INSERT [dbo].[posts] ([post_id], [user_id], [title], [thumbnail], [updated_date], [category_id], [post_details], [featured]) VALUES (4, 1, N'This is fourth post', N'images/post-thumbnails/unnamed.jpg', CAST(N'2022-05-25T01:21:18.750' AS DateTime), 1, N'This is fourth post details', 1)
SET IDENTITY_INSERT [dbo].[posts] OFF
GO
SET IDENTITY_INSERT [dbo].[product_categories] ON 

INSERT [dbo].[product_categories] ([category_id], [category_name], [description], [status]) VALUES (1, N'Male', N'This is first category des', 1)
INSERT [dbo].[product_categories] ([category_id], [category_name], [description], [status]) VALUES (2, N'Female', N'This is second category des', 1)
INSERT [dbo].[product_categories] ([category_id], [category_name], [description], [status]) VALUES (3, N'Laptop', N'', 1)
INSERT [dbo].[product_categories] ([category_id], [category_name], [description], [status]) VALUES (4, N'Desktop', N'', 1)
INSERT [dbo].[product_categories] ([category_id], [category_name], [description], [status]) VALUES (5, N'Smart phone', N'', 1)
INSERT [dbo].[product_categories] ([category_id], [category_name], [description], [status]) VALUES (6, N'Tablet', N'', 1)
INSERT [dbo].[product_categories] ([category_id], [category_name], [description], [status]) VALUES (7, N'Head phone', N'', 1)
INSERT [dbo].[product_categories] ([category_id], [category_name], [description], [status]) VALUES (8, N'Mouse', N'', 1)
INSERT [dbo].[product_categories] ([category_id], [category_name], [description], [status]) VALUES (9, N'Keyboard', N'', 1)
INSERT [dbo].[product_categories] ([category_id], [category_name], [description], [status]) VALUES (10, N'Others', N'', 1)
SET IDENTITY_INSERT [dbo].[product_categories] OFF
GO
SET IDENTITY_INSERT [dbo].[product_images] ON 

INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (1, 1, N'images/product-images/pexels-photo-821651.jpg', N'product 1')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (2, 2, N'images/product-images/EN_GreenOlive-1.jpg', N'product 2')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (3, 2, N'images/product-images/glass-bottle-mockups-for-food-and-beverage-packaging-cover.jpg', N'product 2')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (4, 3, N'images/product_images/hp-205-pro-g8-aio-r3-5r3f1pa-2-1.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (5, 3, N'images/product_images/hp-205-pro-g8-aio-r3-5r3f1pa-3-1.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (6, 3, N'images/product_images/hp-205-pro-g8-aio-r3-5r3f1pa-4.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (7, 3, N'images/product_images/hp-205-pro-g8-aio-r3-5r3f1pa-5.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (8, 3, N'images/product_images/hp-205-pro-g8-aio-r3-5r3f1pa-6.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (9, 3, N'images/product_images/hp-205-pro-g8-aio-r3-5r3f1pa-7.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (10, 3, N'images/product_images/hp-205-pro-g8-aio-r3-5r3f1pa-8.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (11, 4, N'images/product_images/thumb-apple-imac-24-m1-2021-800x450.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (12, 4, N'images/product_images/vi-vn-imac-24-inch-45k-retina-m1-mgph3saa-1.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (13, 4, N'images/product_images/vi-vn-imac-24-inch-45k-retina-m1-mgph3saa-2.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (14, 4, N'images/product_images/vi-vn-imac-24-inch-45k-retina-m1-mgph3saa-3.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (15, 4, N'images/product_images/vi-vn-imac-24-inch-45k-retina-m1-mgph3saa-4.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (16, 5, N'images/product_images/thumb-apple-imac-24-m1-2021-800x450 (1).jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (17, 5, N'images/product_images/vi-vn-imac-24-inch-45k-retina-m1-mgtf3saa-1.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (18, 5, N'images/product_images/vi-vn-imac-24-inch-45k-retina-m1-mgtf3saa-2.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (19, 5, N'images/product_images/vi-vn-imac-24-inch-45k-retina-m1-mgtf3saa-3.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (20, 5, N'images/product_images/vi-vn-imac-24-inch-45k-retina-m1-mgtf3saa-4.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (21, 6, N'images/product_images/vi-vn-asus-zen-aio-m5401wu-r5-ba014w-1.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (22, 6, N'images/product_images/vi-vn-asus-zen-aio-m5401wu-r5-ba014w-2.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (23, 6, N'images/product_images/vi-vn-asus-zen-aio-m5401wu-r5-ba014w-3.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (24, 6, N'images/product_images/vi-vn-asus-zen-aio-m5401wu-r5-ba014w-4.jpg', N'')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (25, 21, N'images/product_images/bluetooth-airpods-pro-magsafe-charge-apple-mlwk3-231021-120617.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (26, 21, N'images/product_images/bluetooth-airpods-pro-magsafe-charge-apple-mlwk3-231021-120615.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (27, 21, N'images/product_images/bluetooth-airpods-pro-magsafe-charge-apple-mlwk3-1.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (28, 22, N'images/product_images/tai-nghe-bluetooth-kanen-k6-den-2-org.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (29, 22, N'images/product_images/tai-nghe-bluetooth-kanen-k6-n.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (30, 23, N'images/product_images/bluetooth-mozard-k8-hong-1-org.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (31, 23, N'images/product_images/bluetooth-mozard-k8-hong-2-org.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (32, 23, N'images/product_images/bluetooth-mozard-k8-1.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (33, 24, N'images/product_images/bluetooth-true-wireless-jlab-go-air-pop-2-2.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (34, 24, N'images/product_images/bluetooth-true-wireless-jlab-go-air-pop-3-2.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (35, 24, N'images/product_images/bluetooth-true-wireless-jlab-go-air-pop-5-1.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (36, 7, N'images/product_images/macbook-air-m1-2020-gray-600x600.jpg', N'macbook air m1 thumbnail')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (37, 7, N'images/product_images/apple-macbook-air-m1-2020-z124000de-4-1-1-1020x570.jpg', N'macbook air m1 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (38, 7, N'images/product_images/vi-vn-apple-macbook-air-m1-2020-z124000de-7.jpg', N'macbook air m1 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (39, 7, N'images/product_images/vi-vn-apple-macbook-air-m1-2020-z124000de-6.jpg', N'macbook air m1 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (40, 7, N'images/product_images/vi-vn-apple-macbook-air-m1-2020-z124000de-2.jpg', N'macbook air m1 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (41, 8, N'images/product_images/dell-xps-17-9710-i7-xps7i7001w1-1-600x600.jpg', N'dell xps 17 9710 thumbnail')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (42, 8, N'images/product_images/vi-vn-dell-xps-17-9710-i7-xps7i7001w1-2.jpg', N'dell xps 17 9710 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (43, 8, N'images/product_images/vi-vn-dell-xps-17-9710-i7-xps7i7001w1-4.jpg', N'dell xps 17 9710 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (44, 8, N'images/product_images/vi-vn-dell-xps-17-9710-i7-xps7i7001w1-10.jpg', N'dell xps 17 9710 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (45, 8, N'images/product_images/vi-vn-dell-xps-17-9710-i7-xps7i7001w1-9.jpg', N'dell xps 17 9710 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (46, 9, N'images/product_images/lenovo-gaming-legion-5-15ith6-i7-82jk00fnvn-180322-100552-600x600.jpg', N'lenovo legion 5 thumbnail')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (47, 9, N'images/product_images/vi-vn-lenovo-gaming-legion-5-15ith6-i7-82jk00fnvn-2.jpg', N'lenovo legion 5 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (48, 9, N'images/product_images/vi-vn-lenovo-gaming-legion-5-15ith6-i7-82jk00fnvn-3.jpg', N'lenovo legion 5 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (49, 9, N'images/product_images/vi-vn-lenovo-gaming-legion-5-15ith6-i7-82jk00fnvn-5.jpg', N'lenovo legion 5 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (50, 9, N'images/product_images/vi-vn-lenovo-gaming-legion-5-15ith6-i7-82jk00fnvn-6.jpg', N'lenovo legion 5 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (51, 10, N'images/product_images/lg-gram-17-i7-17z90pgah76a5-3-600x600.jpg', N'lg gram 17 i7 thumbnail')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (52, 10, N'images/product_images/lg-gram-17-i7-17z90pgah76a5-070521-1108441.jpg', N'lg gram 17 i7 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (53, 10, N'images/product_images/lg-gram-17-i7-17z90pgah76a5-070521-1108442.jpg', N'lg gram 17 i7 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (54, 10, N'images/product_images/lg-gram-17-i7-17z90pgah76a5-070521-1108453.jpg', N'lg gram 17 i7 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (55, 10, N'images/product_images/lg-gram-17-i7-17z90pgah76a5-070521-1108476.jpg', N'lg gram 17 i7 image')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (56, 11, N'images/product_images/k380-multi-device-bluetooth-keyboard_2_.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (57, 12, N'images/product_images/ban-phim-co-gaming-mau-trang-dareu-ek87-white-01.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (58, 13, N'images/product_images/ban-phim-apple-magic-keyboard-2021-1.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (59, 14, N'images/product_images/_0000_z1999964392001_dea65b777420d95cc.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (60, 15, N'images/product_images/ban-phim-khong-day-logitech-k580-2.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (61, 16, N'images/product_images/mx-keys-mini-top-rose-us.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (62, 17, N'images/product_images/_0003_e7dc73590673398238ae0954151de25b.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (63, 18, N'images/product_images/k120-refresh-gallery-images--2-.u3059.d20170508.t165045.665973.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (64, 19, N'images/product_images/ban-phim-co-khong-day-dareu-ek807g-4.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (65, 20, N'images/product_images/ban-phim-co-rapoo-v500se-rainbow-2.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (66, 11, N'images/product_images/k380-multi-device-bluetooth-keyboard_1_.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (67, 12, N'images/product_images/1_52_7.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (68, 13, N'images/product_images/ban-phim-apple-magic-keyboard-2021-4.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (69, 14, N'images/product_images/_0001_z1999964398355_7a400fe0a1fa82e20.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (70, 15, N'images/product_images/ban-phim-khong-day-logitech-k580-1.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (71, 16, N'images/product_images/_0001_mx-keys-mini-profile-black.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (72, 17, N'images/product_images/_0000_product_image-5383-2-1200x675.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (73, 18, N'images/product_images/k120-refresh-gallery-images--3-.u3059.d20170508.t165045.699849.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (74, 19, N'images/product_images/ban-phim-co-khong-day-dareu-ek807g-3.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (75, 20, N'images/product_images/ban-phim-co-rapoo-v500se-rainbow-3.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (76, 11, N'images/product_images/ban-phim-bluetooth-logitech-k380_1.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (77, 12, N'images/product_images/smartekvn-ban-phim-dareu-ek87-pink-white-1.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (78, 13, N'images/product_images/ban-phim-apple-magic-keyboard-2021.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (79, 14, N'images/product_images/_0002_z1999964419602_21e9b7c37f5bdc5db.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (80, 15, N'images/product_images/ban-phim-khong-day-logitech-k580.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (81, 16, N'images/product_images/_0004_mx-keys-mini-top-black-us.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (82, 17, N'images/product_images/ban-phim-gaming-rbg-havit-kb866l.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (83, 18, N'images/product_images/ban-phim-co-day-logitech-k120.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (84, 19, N'images/product_images/ban-phim-co-khong-day-dareu-ek807g-2.jpg', N'des')
INSERT [dbo].[product_images] ([image_id], [product_id], [url], [description]) VALUES (85, 20, N'images/product_images/ban-phim-co-rapoo-v500se-rainbow.jpg', N'des')
SET IDENTITY_INSERT [dbo].[product_images] OFF
GO
SET IDENTITY_INSERT [dbo].[products] ON 

INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (1, N'First product title', 1, 2, NULL, 330000.0000, 240000.0000, N'This is product details, this should be only shown in product details page', 1, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (2, N'second product title', 2, 20, NULL, 145000.0000, 100000.0000, N'This is second product details, this should be only shown in product details page', 1, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (3, N'HP 205 Pro G8 AIO R3 5300U/4GB/256GB/23.8inch FHD/Bàn phím&Chuột//Win11 (5R3F1PA)', 3, 56, CAST(N'2022-05-25T22:34:12.353' AS DateTime), 13890000.0000, 13390000.0000, N'HP 205 Pro G8 AIO R3 5300U (5R3F1PA) là chiếc máy tính AIO được thiết kế tối ưu cho mọi không gian làm việc như văn phòng, quầy lễ tân, sảnh bệnh viện,... khi được tích hợp cả CPU, ổ cứng, loa, camera trên cùng một màn hình nhưng vẫn đảm bảo hiệu năng đáp ứng tốt cho các tác vụ văn phòng, đồ họa cơ bản.', 1, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (4, N'iMac 24 inch 2021 4.5K M1/256GB/8GB/8-core GPU', 4, 12, CAST(N'2022-05-25T22:34:12.353' AS DateTime), 39990000.0000, 36990000.0000, N'iMac 24 inch 2021 4.5K Retina M1 là mẫu máy tính để bàn tích hợp CPU vào màn hình của Apple với thiết kế vẻ ngoài hoàn toàn mới, màu sắc rực rỡ cùng hiệu năng vô cùng mạnh mẽ từ chip M1.', 1, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (5, N'iMac 24 inch 2021 4.5K M1/256GB/8GB/7-core GPU', 4, 15, CAST(N'2022-05-25T22:34:12.353' AS DateTime), 34990000.0000, 31490000.0000, N'Máy tính để bàn iMac 24 inch 2021 4.5K Retina M1 (MGTF3SA/A) của Apple ra mắt đầu quý 2 năm 2021 gây xôn xao bởi diện mạo lột xác mới mẻ, cá tính, đồng thời thừa hưởng sức mạnh từ chip xử lý M1 và màn hình 4.5K Retina, đáp ứng mọi nhu cầu từ văn phòng đến xử lý hình ảnh, video chuyên nghiệp.', 1, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (6, N'Asus Zen AIO M5401WU R5 5500U/8GB/512GB/23.8"F/Touch/Bàn phím&Chuột/Win11 (BA014W)', 4, 56, CAST(N'2022-05-25T22:34:12.353' AS DateTime), 19990000.0000, 18990000.0000, N'Asus Zen AIO M5401WU R5 (BA014W) là phiên bản máy tính All-in-One tiện lợi khi gói gọn tất cả mọi thứ vào chung một màn hình từ ổ cứng, loa, webcam đến CPU tích hợp, tối ưu hóa không gian làm việc nhưng vẫn đáp ứng đa dạng mọi nhu cầu cần thiết hằng ngày.', 1, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (7, N'MacBook Air M1 2020 16GB', 3, 100, CAST(N'2022-05-25T22:36:02.960' AS DateTime), 33990000.0000, 28990000.0000, N'Laptop Apple MacBook Air M1 2020 có thiết kế đẹp, sang trọng với CPU M1 độc quyền từ Apple cho hiệu năng đồ họa cao, màn hình Retina hiển thị siêu nét cùng với hệ thống bảo mật tối ưu.', 1, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (8, N'Dell XPS 17 9710 i7 11800H/16GB/1TB SSD/4GB RTX3050/Touch/Cáp/Office H&S/Win11 (XPS7I7001W1)', 3, 100, CAST(N'2022-05-25T22:36:02.960' AS DateTime), 82990000.0000, 72990000.0000, N'Laptop Dell XPS 17 9710 (XPS7I7001W1) sẽ không làm người dùng thất vọng khi sở hữu ngoại hình thời thượng cùng những thông số kỹ thuật đẳng cấp.', 1, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (9, N'Lenovo Gaming Legion 5 15ITH6 i7 11800H/16GB/512GB/4GB RTX3050Ti/165Hz/Win11 (82JK00FNVN)', 3, 100, CAST(N'2022-05-25T22:36:02.960' AS DateTime), 39990000.0000, NULL, N'Phong cách thiết kế độc đáo, trẻ trung cùng hiệu năng mạnh mẽ vượt trội của card màn hình NVIDIA RTX hội tụ trong chiếc laptop Lenovo Gaming Legion 5 15ITH6 i7 (82JK00FNVN) hứa hẹn sẽ cân mọi tựa game đình đám cũng như sẵn sàng hỗ trợ bạn xử lý các tác vụ nặng.', 1, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (10, N'LG Gram 17 2021 i7 1165G7/16GB/512GB/Win10 (17Z90P-G.AH76A5)', 3, 100, CAST(N'2022-05-25T22:36:02.960' AS DateTime), 52890000.0000, 42890000.0000, N'Laptop LG Gram 17 2021 i7 (17Z90P-G.AH76A5) là 1 phiên bản laptop thời trang mang thiết kế siêu mỏng nhẹ với cấu hình mạnh mẽ, giải trí đẳng cấp, là 1 lựa chọn đầy thú vị dành cho bạn.', 1, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (11, N'Bàn phím Bluetooth Logitech K380', 9, 123, CAST(N'2022-05-25T22:38:42.787' AS DateTime), 344000.0000, 344000.0000, N'Thiết kế hiện đại, mỏng nhẹ cùng với nhiều màu sắc trẻ trung, tiện lợi khi mang theo và không tốn nhiều diện tích trên bàn làm việc', 0, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (12, N'Bàn phím cơ có dây Dareu EK87 TKL', 9, 322, CAST(N'2022-05-25T22:38:42.787' AS DateTime), 344000.0000, 344000.0000, N'Bàn phím cơ có dây DAREU EK87 là bàn phím chuyên dùng chơi game hệ thống Stab phím dài được làm theo dạng Cherry cùng 2 switch phụ. Bàn phím DareU EK87 có thiết kế rất thân thiện với các game thủ. Lớp vỏ bàn phím được làm khá chắc chắn, classic. Keycap Double Shot bền bỉ. Có lớp vỏ dày, cao che kín chân switch.', 0, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (13, N'Bàn phím Apple Magic Keyboard 2021 MK2A3', 9, 98, CAST(N'2022-05-25T22:38:42.787' AS DateTime), 330000.0000, 290000.0000, N'Bàn phím Apple Magic Keyboard 2021 MK2A3 mang thiết kế hiện đại và có tính di động cực cao nhờ vào độ mỏng và trọng lượng chỉ 0.239kg nhờ việc được thiết kế bàn phím không có số, điều này giúp bạn có thể dễ dàng để nó vào trong balo hay túi xách và mang đi khắp nơi khi cần dùng.', 0, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (14, N'Bàn phím cơ không dây Rappo V500 Pro', 9, 145, CAST(N'2022-05-25T22:38:42.787' AS DateTime), 679000.0000, 555000.0000, N'Bàn phím cơ có dây Rapoo V500 Alloy sở hữu một thiết kế sang trọng với bề mặt phủ hợp kim nhôm nhờ đó bàn phím không chỉ mang lại sự sang trọng cùng độ bền bỉ vượt trội.', 0, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (15, N'Bàn phím Bluetooth Logitech K580', 9, 99, CAST(N'2022-05-25T22:38:42.787' AS DateTime), 540000.0000, 440000.0000, N'Bàn phím bluetooth Logitech K580 được thiết kế vô cùng hiện đại và tinh tế. Kích thước chỉ 37.35 x 14.39 x 2.13cm cùng với sự bo tròn mềm mại ở các góc giúp cho bàn phím trở nên mỏng nhẹ và sang trọng hơn rất nhiều. Bên cạnh đó, thiết kế góc nghiêng mang đến cảm giác thoải mái ngay cả khi sử dụng trong nhiều giờ liền.', 0, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (16, N'Bàn phím không dây Logitech MX Keys mini', 9, 123, CAST(N'2022-05-25T22:38:42.787' AS DateTime), 230000.0000, 220000.0000, N'Với thiết kế nhỏ gọn, bỏ đi bớt một số chi tiết rườm rà và dãy số numpad bên phía tay phải, bàn phím không dây Logitech MX Keys Mini giúp cho không gian bàn làm việc của bạn trông thật gọn gàng và có nhiều khoảng trống hơn. Bên cạnh đó việc thiết kế các nút cảm xúc chuyên dùng tích hợp với dãy phím trên cùng cũng giúp cho việc thao tác của bạn trở nên dễ dàng và nhanh hơn bao giờ hết.', 0, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (17, N'Bàn phím Gaming Havit KB866L RGB LED', 9, 132, CAST(N'2022-05-25T22:38:42.787' AS DateTime), 415000.0000, 380000.0000, N'Bàn phím Gaming RGB Havit KB866L có thiết kế nhỏ gọn và chắc chắn, bàn phím cơ giá rẻ cùng chất liệu hợp kim ổn định, giúp cho các phím khi gõ được nhẹ nhàng thoải mái hơn.', 0, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (18, N'Bàn phím có dây Logitech K120', 9, 123, CAST(N'2022-05-25T22:38:42.787' AS DateTime), 220000.0000, 346000.0000, N'Bàn phím có dây LOGITECH K120 sở hữu thiết kế khá truyền thống với gam màu đen. So với các mẫu bàn phím hiện nay thì LOGITECH K120 có thiết kế khá mỏng, vừa giúp tiết kiệm diện tích, vừa tạo nên tính thẩm mỹ cho không gian làm việc của bạn.', 0, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (19, N'Bàn phím cơ không dây Dareu EK807G TKL', 9, 123, CAST(N'2022-05-25T22:38:42.787' AS DateTime), 789000.0000, 770000.0000, N'Bàn phím cơ không dây Dareu EK807G sở hữu thiết kế gọn nhẹ, các ký tự keycap được sơn màu cam nổi bật, khoảng cách giữa các phím hoàn hảo cho bạn trải nghiệm gõ tốt nhất. Tuy nhiên, Dareu EK807G lại không được trang bị đèn LED nhưng bù lại có bộ keycap ABS shot chất lượng.', 0, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (20, N'Bàn phím cơ Rapoo V500SE Rainbow Blue Switch', 9, 123, CAST(N'2022-05-25T22:38:42.787' AS DateTime), 680000.0000, 590000.0000, N'Bàn phím cơ Rapoo V500SE Rainbow Blue Switch được làm từ chất liệu hợp kim cao cấp và có thiết kế nhỏ gọn. Trên bề mặt của bàn phím được sơn nhám tĩnh điện. Bên cạnh đó, các ký tự trên bàn phím được in rất đều đặn. Những phím chức năng được in đậm hơn để người dùng thuận tiện sử dụng hơn.', 0, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (21, N'Tai nghe Bluetooth AirPods Pro MagSafe Charge Apple MLWK3 Trắng ', 7, 100, CAST(N'2022-05-25T22:41:48.703' AS DateTime), 6800000.0000, 5900000.0000, N'Đặc điểm nổi bật

Vẻ ngoài thời trang, kiểu dáng nhỏ gọn, đeo chắc chắn với 3 size nút tai. 
Tái tạo âm thanh sống động, phù hợp với ống tai bạn nhờ chip H1, công nghệ Adaptive EQ.
Kiểm soát âm thanh tai nghe hiệu quả với công nghệ chống ồn chủ động (Active Noise Cancellation) cùng xuyên âm (Transparency mode).
Nghe nhạc đến 4.5 giờ khi bật chống ồn, 5 giờ khi tắt chống ồn.
Sử dụng song song với hộp sạc có thể dùng được đến 24 giờ nghe nhạc.
Hỗ trợ sạc nhanh trong 5 phút có 1 giờ sử dụng. 
Sạc không dây tiện lợi với bộ sạc Magsafe, chuẩn không dây Qi. 
An tâm khi gặp mưa nhỏ, luyện tập ra nhiều mồ hôi với chuẩn chống nước IPX4.
Sản phẩm chính hãng Apple, nguyên seal 100%.
Lưu ý: Thanh toán trước khi mở seal.', 1, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (22, N'Tai nghe Bluetooth Kanen K6', 7, 100, CAST(N'2022-05-25T22:41:48.703' AS DateTime), 600000.0000, 480000.0000, N'Đặc điểm nổi bật

Công nghệ Bluetooth 4.1 cho khoảng cách kết nối lên đến 10 m.
Có thể gọi nhanh, nghe nhạc, tạo cuộc hẹn,... thông qua Siri hay Google Voice.
Đệm tai nghe dày, thoải mái khi sử dụng khoảng thời gian dài.
Dung lượng pin: 500 mAh, cho thời gian sử dụng có thể lên đến 18 giờ, thời gian sạc khoảng 2 giờ.', 1, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (23, N'Tai nghe Bluetooth Mozard K8', 7, 100, CAST(N'2022-05-25T22:41:48.703' AS DateTime), 450000.0000, 360000.0000, N'Đặc điểm nổi bật

Thiết kế đệm tai êm và dày, giúp thoải mái khi đeo.
Có thể kéo giãn tai nghe 3.7 cm để vừa vặn hơn khi sử dụng.
Âm thanh phát ra to rõ, sắc nét, âm trầm dày chắc, đầy nội lực.
Tích hợp mic thoại giúp cho giọng nói rõ ràng, tương tác tốt hơn.
Chuẩn Bluetooth 4.2 cho khoảng cách đến 10 m.
Dung lượng pin 300mAh, thời gian sử dụng 15 giờ, sạc khoảng 2 giờ.
Tương thích với các thiết bị chạy hệ điều hành: Android, Windows, iOS.', 1, 1)
INSERT [dbo].[products] ([product_id], [title], [category_id], [unit_in_stock], [updated_date], [original_price], [sale_price], [product_details], [featured], [status]) VALUES (24, N'Tai nghe Bluetooth True Wireless JLab GO Air POP', 7, 100, CAST(N'2022-05-25T22:41:48.703' AS DateTime), 690000.0000, 500000.0000, N'Thông tin sản phẩm
JLab GO Air POP một trong những chiếc tai nghe hội tụ đủ ba yếu tố: cảm giác đeo thoải mái vượt trội, chất lượng âm thanh hoàn hảo, thời lượng pin vượt xa phân khúc trong tầm giá. 
Một chất âm mang lại đầy sự bất ngờ
JLab GO Air POP được trang bị công nghệ âm thanh 6mm Dynamic driver và EQ Sound mang lại một mức nghe mà theo mình cảm nhận là thật sự rất hay. Hầu như có thể so sánh chiếc tai nghe này với các dòng tai nghe nằm trong phân khúc từ 1 đến 2 triệu.

Nếu so sánh với Galaxy Buds Pro thì chất âm của “em này" đạt 8/10 với một dải bass được thể hiện đậm đà, mạnh, nghe đủ độ ấm và trầm. ', 1, 1)
SET IDENTITY_INSERT [dbo].[products] OFF
GO
SET IDENTITY_INSERT [dbo].[sliders] ON 

INSERT [dbo].[sliders] ([slider_id], [slider_image], [title], [slider_link], [status]) VALUES (1, N'images/slider-images/empty-square-neon-background-free-vector.jpg', N'This is first slider title', N'productslist', 1)
INSERT [dbo].[sliders] ([slider_id], [slider_image], [title], [slider_link], [status]) VALUES (2, N'images/slider-images/istockphoto-1182650732-170667a.jpg', N'This is second slider title', N'product?id=1', 1)
SET IDENTITY_INSERT [dbo].[sliders] OFF
GO
ALTER TABLE [dbo].[accounts]  WITH CHECK ADD  CONSTRAINT [FK_account.role_id] FOREIGN KEY([role_id])
REFERENCES [dbo].[roles] ([role_id])
GO
ALTER TABLE [dbo].[accounts] CHECK CONSTRAINT [FK_account.role_id]
GO
ALTER TABLE [dbo].[general_feedbacks]  WITH CHECK ADD  CONSTRAINT [FK_general_feedbacks.user_id] FOREIGN KEY([user_id])
REFERENCES [dbo].[accounts] ([user_id])
GO
ALTER TABLE [dbo].[general_feedbacks] CHECK CONSTRAINT [FK_general_feedbacks.user_id]
GO
ALTER TABLE [dbo].[order_details]  WITH CHECK ADD  CONSTRAINT [FK_order_details.order_id] FOREIGN KEY([order_id])
REFERENCES [dbo].[orders] ([order_id])
GO
ALTER TABLE [dbo].[order_details] CHECK CONSTRAINT [FK_order_details.order_id]
GO
ALTER TABLE [dbo].[order_details]  WITH CHECK ADD  CONSTRAINT [FK_order_details.product_id] FOREIGN KEY([product_id])
REFERENCES [dbo].[products] ([product_id])
GO
ALTER TABLE [dbo].[order_details] CHECK CONSTRAINT [FK_order_details.product_id]
GO
ALTER TABLE [dbo].[orders_management]  WITH CHECK ADD  CONSTRAINT [FK_order_sales.user_id] FOREIGN KEY([user_id])
REFERENCES [dbo].[accounts] ([user_id])
GO
ALTER TABLE [dbo].[orders_management] CHECK CONSTRAINT [FK_order_sales.user_id]
GO
ALTER TABLE [dbo].[orders_management]  WITH CHECK ADD  CONSTRAINT [FK_orders_sales.order_id] FOREIGN KEY([order_id])
REFERENCES [dbo].[orders] ([order_id])
GO
ALTER TABLE [dbo].[orders_management] CHECK CONSTRAINT [FK_orders_sales.order_id]
GO
ALTER TABLE [dbo].[permissions]  WITH CHECK ADD  CONSTRAINT [FK_permissions.roles] FOREIGN KEY([role_id])
REFERENCES [dbo].[roles] ([role_id])
GO
ALTER TABLE [dbo].[permissions] CHECK CONSTRAINT [FK_permissions.roles]
GO
ALTER TABLE [dbo].[permissions]  WITH CHECK ADD  CONSTRAINT [FK_permissions.screens] FOREIGN KEY([screen_id])
REFERENCES [dbo].[screens] ([screen_id])
GO
ALTER TABLE [dbo].[permissions] CHECK CONSTRAINT [FK_permissions.screens]
GO
ALTER TABLE [dbo].[posts]  WITH CHECK ADD  CONSTRAINT [FK_posts.category_id] FOREIGN KEY([category_id])
REFERENCES [dbo].[post_categories] ([category_id])
GO
ALTER TABLE [dbo].[posts] CHECK CONSTRAINT [FK_posts.category_id]
GO
ALTER TABLE [dbo].[posts]  WITH CHECK ADD  CONSTRAINT [FK_posts.user_id] FOREIGN KEY([user_id])
REFERENCES [dbo].[accounts] ([user_id])
GO
ALTER TABLE [dbo].[posts] CHECK CONSTRAINT [FK_posts.user_id]
GO
ALTER TABLE [dbo].[product_feedbacks]  WITH CHECK ADD  CONSTRAINT [FK_product_feedbacks.product_id] FOREIGN KEY([product_id])
REFERENCES [dbo].[products] ([product_id])
GO
ALTER TABLE [dbo].[product_feedbacks] CHECK CONSTRAINT [FK_product_feedbacks.product_id]
GO
ALTER TABLE [dbo].[product_images]  WITH CHECK ADD  CONSTRAINT [FK_product_image.product_id] FOREIGN KEY([product_id])
REFERENCES [dbo].[products] ([product_id])
GO
ALTER TABLE [dbo].[product_images] CHECK CONSTRAINT [FK_product_image.product_id]
GO
ALTER TABLE [dbo].[products]  WITH CHECK ADD  CONSTRAINT [FK_product.category_id] FOREIGN KEY([category_id])
REFERENCES [dbo].[product_categories] ([category_id])
GO
ALTER TABLE [dbo].[products] CHECK CONSTRAINT [FK_product.category_id]
GO
USE [master]
GO
ALTER DATABASE [SWP391] SET  READ_WRITE 
GO
