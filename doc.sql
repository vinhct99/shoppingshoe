USE [master]
GO
/****** Object:  Database [SoccerShoes]    Script Date: 11/11/2022 22:23:41 ******/
CREATE DATABASE [SoccerShoes]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'SoccerShoes', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\SoccerShoes.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'SoccerShoes_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\SoccerShoes_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [SoccerShoes] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [SoccerShoes].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [SoccerShoes] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [SoccerShoes] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [SoccerShoes] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [SoccerShoes] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [SoccerShoes] SET ARITHABORT OFF 
GO
ALTER DATABASE [SoccerShoes] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [SoccerShoes] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [SoccerShoes] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [SoccerShoes] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [SoccerShoes] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [SoccerShoes] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [SoccerShoes] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [SoccerShoes] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [SoccerShoes] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [SoccerShoes] SET  ENABLE_BROKER 
GO
ALTER DATABASE [SoccerShoes] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [SoccerShoes] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [SoccerShoes] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [SoccerShoes] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [SoccerShoes] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [SoccerShoes] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [SoccerShoes] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [SoccerShoes] SET RECOVERY FULL 
GO
ALTER DATABASE [SoccerShoes] SET  MULTI_USER 
GO
ALTER DATABASE [SoccerShoes] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [SoccerShoes] SET DB_CHAINING OFF 
GO
ALTER DATABASE [SoccerShoes] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [SoccerShoes] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [SoccerShoes] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [SoccerShoes] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'SoccerShoes', N'ON'
GO
ALTER DATABASE [SoccerShoes] SET QUERY_STORE = OFF
GO
USE [SoccerShoes]
GO
/****** Object:  Table [dbo].[Dathang]    Script Date: 11/11/2022 22:23:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Dathang](
	[tenKH] [nvarchar](50) NOT NULL,
	[diachiKH] [nvarchar](50) NOT NULL,
	[sodienthoai] [nvarchar](50) NOT NULL,
	[email] [nvarchar](50) NOT NULL,
	[ghichu] [nvarchar](50) NOT NULL,
	[tenSP] [nvarchar](50) NOT NULL,
	[size] [float] NOT NULL,
	[soluong] [int] NOT NULL,
	[tongtien] [float] NOT NULL,
 CONSTRAINT [PK_Dathang] PRIMARY KEY CLUSTERED 
(
	[tenKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Giohang]    Script Date: 11/11/2022 22:23:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Giohang](
	[maSP] [nvarchar](50) NOT NULL,
	[tenSP] [nvarchar](500) NOT NULL,
	[gia] [float] NOT NULL,
	[image] [nvarchar](50) NOT NULL,
	[size] [float] NOT NULL,
	[soluong] [int] NOT NULL,
 CONSTRAINT [PK_Giohang] PRIMARY KEY CLUSTERED 
(
	[maSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[manager]    Script Date: 11/11/2022 22:23:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[manager](
	[Sanpham_id] [int] IDENTITY(1,1) NOT NULL,
	[TenSp] [varchar](50) NOT NULL,
	[AnhSp] [varchar](50) NOT NULL,
	[GiaSp] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Sanpham_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Phone]    Script Date: 11/11/2022 22:23:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Phone](
	[maSP] [int] IDENTITY(1,1) NOT NULL,
	[tenSP] [nvarchar](50) NOT NULL,
	[gia] [float] NOT NULL,
	[anhSP] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Sanpham]    Script Date: 11/11/2022 22:23:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sanpham](
	[maSP] [nvarchar](50) NOT NULL,
	[tenSP] [nvarchar](50) NOT NULL,
	[type] [nvarchar](50) NOT NULL,
	[gia] [float] NOT NULL,
	[kichthuoc] [float] NOT NULL,
	[thongtinSP] [nvarchar](500) NOT NULL,
	[anhSP] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Sanpham] PRIMARY KEY CLUSTERED 
(
	[maSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Dathang] ([tenKH], [diachiKH], [sodienthoai], [email], [ghichu], [tenSP], [size], [soluong], [tongtien]) VALUES (N'a', N'a', N'a', N'a', N'a', N'Adidas Copa 20.3 TF', 40, 1, 90)
INSERT [dbo].[Dathang] ([tenKH], [diachiKH], [sodienthoai], [email], [ghichu], [tenSP], [size], [soluong], [tongtien]) VALUES (N'huy', N'ha noi', N'0983857685', N'vikti1999@gmail.com', N'a', N'Nike Mercurial Vapor XIII', 43, 3, 120)
INSERT [dbo].[Dathang] ([tenKH], [diachiKH], [sodienthoai], [email], [ghichu], [tenSP], [size], [soluong], [tongtien]) VALUES (N'vinh', N'ha noi', N'0983857686', N'vikti1999@gmail.com', N'asdasd', N'Adidas Predator 20.3 FG', 42, 1, 100)
INSERT [dbo].[Dathang] ([tenKH], [diachiKH], [sodienthoai], [email], [ghichu], [tenSP], [size], [soluong], [tongtien]) VALUES (N'vinh cao', N'ha noi', N'0983857685', N'vc@gmail.com', N'as', N'Adidas Nemeziz Messi ', 42, 1, 70)
GO
SET IDENTITY_INSERT [dbo].[Phone] ON 

INSERT [dbo].[Phone] ([maSP], [tenSP], [gia], [anhSP]) VALUES (1, N'iphone 12 series', 22000, N'images/ip1.jpg')
INSERT [dbo].[Phone] ([maSP], [tenSP], [gia], [anhSP]) VALUES (2, N'iphone 11 series', 13000, N'images/ip2.jpg')
INSERT [dbo].[Phone] ([maSP], [tenSP], [gia], [anhSP]) VALUES (3, N'iphone X series', 14000, N'images/ip3.jpg')
INSERT [dbo].[Phone] ([maSP], [tenSP], [gia], [anhSP]) VALUES (4, N'oppo find x series', 12000, N'images/opp2.jpg')
INSERT [dbo].[Phone] ([maSP], [tenSP], [gia], [anhSP]) VALUES (5, N'oppo find x series', 13000, N'images/opp3.jpg')
INSERT [dbo].[Phone] ([maSP], [tenSP], [gia], [anhSP]) VALUES (6, N'oppo find x series', 12000, N'images/opp5.jpg')
INSERT [dbo].[Phone] ([maSP], [tenSP], [gia], [anhSP]) VALUES (7, N'Galaxy Z series', 11000, N'images/ss1.jpg')
INSERT [dbo].[Phone] ([maSP], [tenSP], [gia], [anhSP]) VALUES (8, N'galaxy note series', 12000, N'images/ss2.jpg')
INSERT [dbo].[Phone] ([maSP], [tenSP], [gia], [anhSP]) VALUES (9, N'galaxy F series', 12000, N'images/ss3.jpg')
INSERT [dbo].[Phone] ([maSP], [tenSP], [gia], [anhSP]) VALUES (10, N'Vsmart Joy 4 3GB-64GB', 12000, N'images/vsm1.jpg')
SET IDENTITY_INSERT [dbo].[Phone] OFF
GO
INSERT [dbo].[Sanpham] ([maSP], [tenSP], [type], [gia], [kichthuoc], [thongtinSP], [anhSP]) VALUES (N'', N'nike mercurial vapor 13 pro tf', N'', 80, 41, N'asv', N'adidasx1.jpg')
INSERT [dbo].[Sanpham] ([maSP], [tenSP], [type], [gia], [kichthuoc], [thongtinSP], [anhSP]) VALUES (N'N003', N'Nike Mercurial Vapor XIII', N'Nike', 120, 40, N'a', N'Nike Mercurial Vapor XIII Academy AG.jpg')
INSERT [dbo].[Sanpham] ([maSP], [tenSP], [type], [gia], [kichthuoc], [thongtinSP], [anhSP]) VALUES (N'N004', N'Adidas x ghosted.1 tf', N'Adidas', 80, 41, N'asv', N'adidasx1.jpg')
INSERT [dbo].[Sanpham] ([maSP], [tenSP], [type], [gia], [kichthuoc], [thongtinSP], [anhSP]) VALUES (N'N005', N'nike mercurial vapor 13 pro tf', N'Nike', 60, 41, N'a', N'nike1.jpg')
INSERT [dbo].[Sanpham] ([maSP], [tenSP], [type], [gia], [kichthuoc], [thongtinSP], [anhSP]) VALUES (N'N006', N'Adidas x ghosted.1 tf', N'Adidas', 80, 41, N'asv', N'adidasx1.jpg')
INSERT [dbo].[Sanpham] ([maSP], [tenSP], [type], [gia], [kichthuoc], [thongtinSP], [anhSP]) VALUES (N'N007', N'Adidas x ghosted.1 tf', N'Adidas', 80, 43, N'Ã¡dasdasd', N'adidasx1.jpg')
INSERT [dbo].[Sanpham] ([maSP], [tenSP], [type], [gia], [kichthuoc], [thongtinSP], [anhSP]) VALUES (N'N008', N'Adidas x ghosted.1 tf', N'Nike', 80, 41, N'asv', N'nike1.jpg')
INSERT [dbo].[Sanpham] ([maSP], [tenSP], [type], [gia], [kichthuoc], [thongtinSP], [anhSP]) VALUES (N'N009', N'Adidas x ghosted.1 tf', N'Adidas', 80, 41, N'Ã¡dasdasd', N'nike1.jpg')
INSERT [dbo].[Sanpham] ([maSP], [tenSP], [type], [gia], [kichthuoc], [thongtinSP], [anhSP]) VALUES (N'N010', N'nike mercurial vapor 13 pro tf', N'Nike', 60, 43, N'Ã¡dasdasd', N'adidasx1.jpg')
INSERT [dbo].[Sanpham] ([maSP], [tenSP], [type], [gia], [kichthuoc], [thongtinSP], [anhSP]) VALUES (N'N011', N'Adidas x ghosted.1 tf', N'Adidas', 60, 41, N'Ã¡dasdasd', N'nike1.jpg')
GO
USE [master]
GO
ALTER DATABASE [SoccerShoes] SET  READ_WRITE 
GO
