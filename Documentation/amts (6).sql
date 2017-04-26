-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2015 at 06:17 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `amts`
--

-- --------------------------------------------------------

--
-- Table structure for table `adhar_card`
--

CREATE TABLE IF NOT EXISTS `adhar_card` (
  `adhar_id` bigint(12) NOT NULL,
  `f_name` varchar(15) NOT NULL,
  `m_name` varchar(15) NOT NULL,
  `l_name` varchar(15) NOT NULL,
  `gen` varchar(6) NOT NULL,
  `dob` date NOT NULL,
  `adress` varchar(80) NOT NULL,
  `pincode` int(6) NOT NULL,
  `pic` varchar(60) NOT NULL,
  `contact_no` varchar(10) NOT NULL,
  `mail_id` varchar(30) NOT NULL,
  PRIMARY KEY (`adhar_id`),
  UNIQUE KEY `adhar_id` (`adhar_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adhar_card`
--

INSERT INTO `adhar_card` (`adhar_id`, `f_name`, `m_name`, `l_name`, `gen`, `dob`, `adress`, `pincode`, `pic`, `contact_no`, `mail_id`) VALUES
(100000000001, 'pandit', 'ayush', 'kamleshkumar', 'male', '2000-05-17', '28/rajapath banglow,vatva,ahmedabad', 380175, '/amts/images/128_128/1.jpg', '9273333290', 'panditayush@gmail.com'),
(100000000002, 'prajapati', 'deepak', 'pratap bhai', 'male', '1953-11-03', '175,dharmbhoomi soc,\r\nghodasar,ahmdabad', 380050, '/amts/images/128_128/44.jpg', '9586301757', 'deepakprajapati589@gmail.com'),
(100000000003, 'patel', 'darshan', 'pratap bhai', 'male', '1996-01-26', '23,vrundavan soc,\r\nnigam,\r\nghodasar-amedabad', 380050, '/amts/images/128_128/3.jpg', '9601140078', 'darshan26@gmail.com'),
(100000000004, 'chauhan', 'vijay', 'jayesh bhai', 'male', '1955-10-24', '15,sarthsk apartment,\r\nnigam,\r\nghodasar,ahmedabad', 380050, '/amts/images/128_128/4.jpg', '8513647523', 'vijaybabau@yahoo.com'),
(100000000005, 'rami', 'vatsal', 'hitesh bhai', 'male', '1995-09-15', '2-b,akksah flats,\r\nnaroda,ahmedabad', 380175, '/amts/images/128_128/5.jpg', '9586472615', 'vatsalrami@gmail.com'),
(100000000006, 'raval', 'harsh', 'mahesh bhai', 'male', '1995-07-13', '2-b,akshar flats,\nvasna,ahmedabad', 380175, '/amts/images/128_128/6.jpg', '9586472615', 'harshraval@gmail.com'),
(100000000008, 'tripathi', 'yash', 'parshkumar', 'male', '2000-03-10', '6/rajapath banglows,near nigam,ghodasar,ahmedabada', 380175, '/amts/images/128_128/7.jpg', '9878673545', 'yashtri@gmail.com'),
(100000000009, 'pandya', 'tapan', 'parshkumar', 'male', '1990-03-17', '68/rajapath banglows,near nigam,ghodasar,ahmedabada', 380175, '/amts/images/128_128/8.jpg', '9271837289', 'taps@gmail.com'),
(100000000010, 'thakkar', 'anuj', 'kamleshkumar', 'male', '1954-03-17', '7/rajapath banglow,vatva,ahmedabad', 380175, '/amts/images/128_128/9.jpg', '9271837233', 'anujthakka@gmail.com'),
(100000000012, 'pandit', 'harshil', 'chandubhai', 'male', '2001-02-09', '28/janpath soc.,banglow,paldi,ahmedabad', 380175, '/amts/images/128_128/10.jpg', '9273334223', 'pandithrsh@gmail.com'),
(100000000013, 'patel', 'jay', 'vikashbhai', 'male', '1992-10-03', '28/radhavallabh soc,paldi,ahmedabad', 380175, '/amts/images/128_128/11.jpg', '9821837223', 'pateljay@gmail.com'),
(100000000014, 'patel', 'akash', 'nileshbhai', 'male', '2000-11-10', '10/ratnadeep soc,ghodasar,ahmedabad', 380175, '/amts/images/128_128/12.jpg', '9821837223', 'akashpatel@gmail.com'),
(100000000015, 'joshi', 'vinod', 'jayendrabhai', 'male', '1955-12-20', '18/j vidhyanagar,ahmedabad', 380175, '/amts/images/128_128/13.jpg', '8971837223', 'vinod@gmail.com'),
(100000000016, 'raval', 'sanjana', 'nileshbhai', 'female', '1999-07-09', '8/vikasharth soc,narol,ahmedabad', 380175, '/amts/images/128_128/14.jpg', '9898378373', 'sanjul@gmail.com'),
(100000000017, 'patel', 'deep', 'nishitbhai', 'male', '1970-05-02', '18/vishvakarma soc,narol,ahmedabad', 380175, '/amts/images/128_128/15.jpg', '8937284923', 'deeppatel@gmail.com'),
(100000000020, 'pandya', 'sanjay', 'jighneshbhai', 'male', '1956-06-14', '10/agamnigam soc,isanpur,ahmedabad', 380175, '/amts/images/128_128/16.jpg', '9271837223', 'snjay@gmail.com'),
(100000000022, 'pandit', 'jaya', 'neelbhai', 'female', '2000-12-20', '8/tirthay flat,vadaj,ahmedabad', 380175, '/amts/images/128_128/17.jpg', '8967898789', 'panditjaya@gmail.com'),
(100000000023, 'patel', 'sneh', 'mitbhai', 'male', '2001-06-14', '12/sarswati banglows,vasna,ahmedabad', 380175, '/amts/images/128_128/18.jpg', '9556778708', 'snehpatela@gmail.com'),
(100000000024, 'trivedi', 'manoj', 'nileshbhai', 'male', '1952-02-11', '45/jogeshvari soc,paldi,ahmedabad', 380175, '/amts/images/128_128/19.jpg', '9271837223', 'trivedmanoj@gmail.com'),
(100000000025, 'shah', 'drashti', 'niravbhai', 'female', '2000-12-11', '23/bhagvan nagar,paldi,ahmedabad', 380175, '/amts/images/128_128/20.jpg', '9271837223', 'drshtishah@gmail.com'),
(100000000026, 'dave', 'kinju', 'dipenkumar', 'female', '1999-10-06', '6-c/bhavani soc,chandranagar,ahmedabad', 380175, '/amts/images/128_128/21.jpg', '9271837223', 'kinjudave@gmail.com'),
(100000000027, 'prikh', 'narendra', 'divyeshbahi', 'male', '1993-05-07', '232b/vadilalnagar,paldi,ahmedabad', 380175, '/amts/images/128_128/22.jpg', '9271837223', 'narendraparikh@gmail.com'),
(100000000028, 'trivedi', 'khushi', 'surshbhai', 'male', '1999-12-17', '232b/vadilalnagar,paldi,ahmedabad', 380175, '/amts/images/128_128/23.jpg', '9271837223', 'khushitrivedi@gmail.com'),
(100000000029, 'mandeliya', 'pratap', 'kanubhai', 'male', '1996-04-10', '8/janpath soc,paldi,ahmedabad', 380175, '/amts/images/128_128/24.jpg', '9271453434', 'mandeliyaa@gmail.com'),
(100000000031, 'patel', 'viral', 'bharat bhai', 'male', '1996-03-12', '23,shreeji park,\r\nghodasar,ahmedabad', 380045, '/amts/images/128_128/25.jpg', '9726014875', 'viralpatel92@hotmail.com'),
(100000000032, 'vyas', 'nilay', 'vikashbhai', 'male', '2015-07-13', '36/f nilkanth soc,bapunagar,ahmedabad', 3800050, '/amts/images/128_128/26.jpg', '7777737223', 'nilayvyash@yahoo.com'),
(100000000033, 'cahuhan', 'chirag', 'kanubhai', 'male', '1999-12-17', '28 satyamfltes,raypur,ahmedabad', 380175, '/amts/images/128_128/27.jpg', '8887675678', 'chauhanchirag@gmail.com'),
(100000000034, 'thakar', 'anil', 'virendrabhai', 'male', '1999-05-07', '3 shuramya flates,maninagar,ahmedabad', 380175, '/amts/images/128_128/28.jpg', '887362798', 'thakaranil@gmail.com'),
(100000000035, 'patel', 'hitesh', 'ileshbhai', 'male', '1999-10-09', '33 arpan socit, narol ,ahmedabad', 380175, '/amts/images/128_128/29.jpg', '20133234', 'hiteshpatel@gmail.com'),
(100000000036, 'thakkar', 'harivadhan', 'anilkumar', 'male', '2000-08-16', '4 swaminarayan soc,choras gam,ahmedabad', 380175, '/amts/images/128_128/30.jpg', '8876767223', 'thakkar6767@gmail.com'),
(100000000037, 'patil', 'krunal', 'jatinbhai', 'male', '2000-09-28', '21 pavan banglows,vivekanand nagar,ahmedabad', 380026, '/amts/images/128_128/31.jpg', '9876786787', 'krunalpatil27@gmail.com'),
(100000000038, 'joshi', 'pavan', 'priteshbhai', 'male', '2001-08-03', 'n13 mahespati sco,punitnagar,ahmedabad', 382767, '/amts/images/128_128/32.jpg', '8973627833', 'pavanjoshi@gmail.com'),
(100000000039, 'pandit', 'kalpesh', 'hiteshbhai', 'male', '2002-05-05', '33 radhavallabh park,meghaninagar,ahmedbad', 389992, '/amts/images/128_128/33.jpg', '9998378298', 'pandikalpesh@yahoo.com'),
(100000000040, 'patel', 'chirag', 'harshbhai', 'male', '2002-05-07', 'A215 ishvarnagar,sarkhej,ahmedabad', 380018, '/amts/images/128_128/34.jpg', '9877876798', 'chiragpatel@yahoo.com'),
(100000000041, 'varma ', 'romesh', 'pankajbhai', 'male', '2001-11-09', '11 siddharth soc,paldi,ahmedabad', 389289, '/amts/images/128_128/35.jpg', '8927828882', 'varmaromesh@yahoo.com'),
(1000000000007, 'rami', 'mak', 'vijaybhai', 'male', '1995-09-01', '9/b,radhavallabh soc, ghodasar\r\nvasna,ahmedabad', 380175, '/amts/images/128_128/36.jpg', '9878677789', 'mak234@gmail.com'),
(1000000000018, 'pandit', 'jayesh', 'jaybhai', 'male', '1999-09-08', 'b-4/jogeshvari soc,jasoda,ahmedabad', 380175, '/amts/images/128_128/37.jpg', '7896756789', 'jaeshpanditl@gmail.com'),
(1000000000019, 'vaghela', 'jaydeep', 'vijaybhai', 'male', '2001-03-08', 'c-8/rajpath soc,paldi,ahmedabad', 380175, '/amts/images/128_128/38.jpg', '7893273829', 'jaedeep@gmail.com'),
(1000000000021, 'vaghela', 'viajy', 'neelbhai', 'male', '2000-08-16', 'b-5/maheshvari soc,narol,ahmedabad', 380175, '/amts/images/128_128/39.jpg', '8937283728', 'vaghelavijay262@gmail.com'),
(1000000000030, 'thakkar', 'jayes', 'vikashbhai', 'male', '1951-09-14', 'v-5/janpath soc,ranip,ahmedabad', 380175, '/amts/images/128_128/40.jpg', '9271837223', 'Jayesh@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `bus_list`
--

CREATE TABLE IF NOT EXISTS `bus_list` (
  `bus_no` varchar(8) NOT NULL,
  `root_no` varchar(6) NOT NULL,
  `Start_place` varchar(40) NOT NULL,
  `End_place` varchar(40) NOT NULL,
  PRIMARY KEY (`bus_no`,`root_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus_list`
--

INSERT INTO `bus_list` (`bus_no`, `root_no`, `Start_place`, `End_place`) VALUES
('ac-00200', '1', 'Lal Darwaja', 'Ratan Park'),
('ac-00201', '14', 'Lal Darwaja', 'Chosar'),
('ac-00201', '14/1', 'Lal Darwaja', 'Vatva  Crossing'),
('ac-00202', '15', 'Vivekanand Nagar', '	Nava Wadaj'),
('ac-00203', '15/1', 'Maninagar', 'Vinobabhave Nagar'),
('ac-00204', '18', 'Kalupur', 'Punit Nagar'),
('ac-00205', '20', 'Maninagar', 'Civil Hospital'),
('ac-00206', '21/1', 'Lal Darwaja', 'Gyaspur'),
('ac-00207', '31', 'Meghani Nagar', 'Sarkhej Gam'),
('ac-00208', '31/1', 'Sarkhej', 'Civil Hospital'),
('ac-00209', '31/2', 'Sarkhej Roja', 'Civil Hospital'),
('ac-00209', '32', 'Butbhavani Mata Mand', 'Sahyadri Bunglows'),
('ac-00278', '16', 'nigam society', 'chiloda gam'),
('ac-00279', '16', 'nigam society', 'chiloda gam'),
('ac-00280', '16', 'nigam society', 'chiloda gam'),
('ac-00300', '34', 'Butbhavani Mata Mand', 'Kalapi Nagar'),
('ac-00301', '34/3', 'Laldarwaja', 'Makarba gam'),
('ac-00301', '34/5', 'Butbhavani Mata Mand', 'Kalapinagar'),
('ac-00400', '35', 'Lal Darwaja', 'Matoda patiya'),
('ac-00401', '36', 'Sarangpur tarminas', 'Sarkhej gam'),
('ac-00402', '36/1', 'Sarangpur tarminas', 'sarkhej roja'),
('ac-00403', '37', 'Vasana', 'Manoharpark'),
('ac-00404', '37/4', 'Kalupur tarminas', 'Butbhavani mta mandir'),
('ac-00500', '40', 'Vasana tarminas', 'Lapkaman gam'),
('ac-00501', '40/1', 'Iskon mandir', 'Vinobabhave nagar'),
('ac-00502', '40/2', 'Sarkhej gam', 'Tri mandir '),
('ac-00502', '40/3', 'Butbhavani mata mandir', 'Gayatri vidhyalay'),
('ac-00502', '42', 'Ghodasar gam', 'Parijat banglows'),
('ac-00600', '203', 'Paladi tarminas', 'Vaishnavdevi mandir'),
('ac-00601', '204', 'Vasna tarminas(cerculer)', 'Vasna tarminas'),
('ac-00602', '205', 'Vasna tarminas(ant-cerculer)', 'Vasna tarminas'),
('ac-00603', '401', 'Vasana tarminas', 'chandkheda gam'),
('ac-00604', '501', 'Vasna tarminas', 'Chandkhedagam'),
('ac-00630', '13/1', 'isanpur', 'ranip'),
('ac-01325', '52/2', 'maninagar', 'satadhar society'),
('ac-01575', '13/1s', 'nigam society', 'ranip');

-- --------------------------------------------------------

--
-- Table structure for table `bus_shedule`
--

CREATE TABLE IF NOT EXISTS `bus_shedule` (
  `record_no` int(6) NOT NULL AUTO_INCREMENT,
  `root_no` varchar(6) NOT NULL,
  `bus_no` varchar(8) NOT NULL,
  `start_time` time NOT NULL,
  PRIMARY KEY (`record_no`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=88 ;

--
-- Dumping data for table `bus_shedule`
--

INSERT INTO `bus_shedule` (`record_no`, `root_no`, `bus_no`, `start_time`) VALUES
(1, '16', 'ac-00278', '06:10:00'),
(2, '16', 'ac-00279', '06:45:00'),
(3, '16', 'ac-00278', '07:15:00'),
(4, '16', 'ac-00278', '08:00:00'),
(5, '16', 'ac-00280', '09:15:00'),
(6, '16', 'ac-00279', '11:45:00'),
(7, '16', 'ac-00278', '02:15:00'),
(8, '16', 'ac-00279', '04:00:00'),
(9, '16', 'ac-00280', '06:25:00'),
(10, '16', 'ac-00279', '08:15:00'),
(11, '16', 'ac-00279', '09:45:00'),
(12, '13/1', 'ac-10000', '06:10:00'),
(13, '13/1', 'ac-10001', '06:45:00'),
(14, '13/1', 'ac-10002', '07:15:00'),
(15, '13/1', 'ac-10003', '08:00:00'),
(16, '13/1', 'ac-10004', '09:15:00'),
(17, '13/1', 'ac-10005', '11:45:00'),
(18, '13/1', 'ac-10006', '02:15:00'),
(19, '13/1', 'ac-10007', '04:00:00'),
(20, '13/1', 'ac-10008', '06:25:00'),
(21, '13/1', 'ac-10009', '08:15:00'),
(22, '13/1', 'ac-10010', '09:45:00'),
(23, '15', 'ac-20001', '06:10:00'),
(24, '15', 'ac-20002', '06:45:00'),
(25, '15', 'ac-20003', '07:15:00'),
(26, '15', 'ac-20004', '08:00:00'),
(27, '15', 'ac-20005', '09:15:00'),
(28, '15', 'ac-20006', '11:45:00'),
(29, '15', 'ac-20007', '02:15:00'),
(30, '15', 'ac-20008', '04:00:00'),
(31, '15', 'ac-20009', '06:25:00'),
(32, '15', 'ac-20010', '08:15:00'),
(33, '15/1', 'ac-30001', '06:10:00'),
(34, '15/1', 'ac-30002', '06:45:00'),
(35, '15/1', 'ac-30003', '07:15:00'),
(36, '15/1', 'ac-30004', '08:00:00'),
(37, '15/1', 'ac-30005', '09:15:00'),
(38, '15/1', 'ac-30006', '11:45:00'),
(39, '15/1', 'ac-30007', '02:15:00'),
(40, '15/1', 'ac-30008', '04:00:00'),
(41, '15/1', 'ac-30009', '06:25:00'),
(42, '15/1', 'ac-30010', '08:15:00'),
(43, '15/1', 'ac-30011', '09:45:00'),
(44, '18', 'ac-40001', '06:10:00'),
(45, '18', 'ac-40002', '06:45:00'),
(46, '18', 'ac-40003', '07:15:00'),
(47, '18', 'ac-40004', '08:00:00'),
(48, '18', 'ac-40005', '09:15:00'),
(49, '18', 'ac-40006', '11:45:00'),
(50, '18', 'ac-40007', '02:15:00'),
(51, '18', 'ac-40008', '04:00:00'),
(52, '18', 'ac-40009', '06:25:00'),
(53, '18', 'ac-40010', '08:15:00'),
(54, '18', 'ac-40011', '09:45:00'),
(55, '20', 'ac-50001', '06:10:00'),
(56, '20', 'ac-50002', '06:45:00'),
(57, '20', 'ac-50003', '07:15:00'),
(58, '20', 'ac-50004', '08:00:00'),
(59, '20', 'ac-50005', '09:15:00'),
(60, '20', 'ac-50006', '11:45:00'),
(61, '20', 'ac-50007', '02:15:00'),
(62, '20', 'ac-50008', '04:00:00'),
(63, '20', 'ac-50009', '06:25:00'),
(64, '20', 'ac-50010', '08:15:00'),
(65, '20', 'ac-50011', '09:45:00'),
(66, '31', 'ac-60001', '06:10:00'),
(67, '31', 'ac-60002', '06:45:00'),
(68, '31', 'ac-60003', '07:15:00'),
(69, '31', 'ac-60004', '08:00:00'),
(70, '31', 'ac-60005', '09:15:00'),
(71, '31', 'ac-60006', '11:45:00'),
(72, '31', 'ac-60007', '02:15:00'),
(73, '31', 'ac-60008', '04:00:00'),
(74, '31', 'ac-60009', '06:25:00'),
(75, '31', 'ac-60010', '08:15:00'),
(76, '31', 'ac-60011', '00:00:00'),
(77, '31/1', 'ac-70001', '06:10:00'),
(78, '31/1', 'ac-70002', '06:45:00'),
(79, '31/1', 'ac-70003', '00:00:00'),
(80, '31/1', 'ac-70004', '08:00:00'),
(81, '31/1', 'ac-70005', '09:15:00'),
(82, '31/1', 'ac-70006', '11:45:00'),
(83, '31/1', 'ac-70007', '02:15:00'),
(84, '31/1', 'ac-70008', '04:00:00'),
(85, '31/1', 'ac-70009', '06:25:00'),
(86, '31/1', 'ac-70010', '08:15:00'),
(87, '31/1', 'ac-70011', '09:45:00');

-- --------------------------------------------------------

--
-- Table structure for table `bus_stop`
--

CREATE TABLE IF NOT EXISTS `bus_stop` (
  `root_no` varchar(6) NOT NULL,
  `stop_no` int(3) NOT NULL,
  `place` varchar(20) NOT NULL,
  `area_code` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus_stop`
--

INSERT INTO `bus_stop` (`root_no`, `stop_no`, `place`, `area_code`) VALUES
('16', 1, 'ghodasar cross-road', 380050),
('16', 2, 'avakar hall', 380045),
('16', 3, 'dakshini society', 380045),
('16', 4, 'maninagar', 380015),
('16', 5, 'rambaug', 380015),
('16', 6, 'raypur', 380046),
('16', 7, 'kalupur', 380047),
('16', 8, 'civil hospital', 380351),
('16', 9, 'meghani nagar', 380175),
('1', 1, 'gandhi road', 380001),
('1', 2, 'kalupur', 380002),
('1', 3, 'shri nagar mils', 380002),
('1', 4, 'sardaben hospital', 380018),
('1', 5, 'khodiyar nagar', 380018),
('14', 1, 'khamasa', 380001),
('14', 2, 's.t bus stop', 380022),
('14', 3, 'pushpakunj', 380022),
('14', 4, 'isanpur', 382443),
('14', 5, 'vatvagam', 382445),
('34', 1, 'jivarajpark', 380051),
('34', 2, 'paldi', 380007),
('34', 3, 'laldarwaja', 380001),
('34', 4, 'civil hospitel', 380016),
('34', 5, 'umiya nagar', 380016),
('14/1', 1, 'khamasa', 380001),
('14/1', 2, 's.t bus stop', 380022),
('14/1', 3, 'pushpakunj', 380022),
('14/1', 4, 'isanpur', 382443),
('14/1', 5, 'bibitalav', 382445),
('15', 1, 'hathijan', 382445),
('15', 2, 'vatva patiya', 382445),
('15', 3, 'jashoda nagar', 382445),
('15', 4, 'hatkeshvar', 380026),
('15', 5, 'amaraivadi', 380026),
('15/1', 1, 'maninagar charrasta', 380008),
('15/1', 2, 'madhrashi mandir', 380008),
('15/1', 3, 'maninagar crossing', 380008),
('15/1', 4, 'vinzol', 382445),
('15/1', 5, 'ayojan nagar', 382445),
('16', 0, 'nigam soc', 380050),
('16', 0, 'chiloda gam', 380999),
('1', 10, 'Lal Darwaja', 380001),
('1', 10, 'Ratan Park', 380022),
('14', 11, 'Lal Darwaja', 380022),
('14', 11, 'Chosar', 382440),
('14/1', 12, 'Lal Darwaja', 382445),
('14/1', 12, 'Vatva  Crossing', 382445),
('15', 13, 'Vivekanand Nagar', 380015),
('15', 13, 'Nava Wadaj', 389910),
('15/1', 14, 'Maninagar', 380030),
('15/1', 14, 'Vinobabhave Nagar', 380010),
('18', 15, 'Kalupur', 380050),
('18', 15, 'Punit Nagar', 380005),
('20', 16, 'Maninagar', 380022),
('20', 16, 'Civil Hospital', 380018),
('21/1', 17, 'Lal Darwaja', 382445),
('21/1', 17, 'Gyaspur', 389976),
('31', 18, 'Meghani Nagar', 300039),
('31', 18, 'Sarkhej Gam', 302891),
('31/1', 19, 'Sarkhej', 309829),
('31/1', 19, 'Civil Hospital', 389289),
('32', 20, 'Sarkhej Roja', 309298),
('32', 20, 'Civil Hospital', 299389),
('16', 21, 'Butbhavani Mata Mand', 2112),
('16', 21, 'Sahyadri Bunglows', 2121),
('40', 22, 'Vasana tarminas', 232323),
('40', 22, 'Lapkaman gam', 233322),
('40/1', 23, 'Iskon mandir', 233233),
('40/1', 23, 'Vinobabhave nagar', 323220),
('42', 24, 'Ghodasar gam', 323222),
('42', 24, 'Parijat banglow', 2323222),
('203', 25, 'Paladi tarminas', 322342),
('203', 25, 'Vaishnavdevi mandir', 342332),
('204', 26, 'Vasna tarminas(cercu', 32223),
('204', 26, 'Vasna tarminas', 323222),
('401', 27, 'Vasana tarminas', 30298),
('401', 27, 'handkheda gam', 332423),
('501', 28, 'Vasna tarminas', 320283),
('501', 28, 'Chandkhedagam', 328233),
('13/1', 29, 'isanpur', 392897),
('13/1', 29, 'ranip', 236233),
('203', 25, 'Paladi tarminas', 322342),
('203', 25, 'Vaishnavdevi mandir', 342332),
('204', 26, 'Vasna tarminas(cercu', 32223),
('204', 26, 'Vasna tarminas', 323222),
('401', 27, 'Vasana tarminas', 30298),
('401', 27, 'handkheda gam', 332423),
('501', 28, 'Vasna tarminas', 320283),
('501', 28, 'Chandkhedagam', 328233),
('13/1', 29, 'isanpur', 392897),
('13/1', 29, 'ranip', 236233);

-- --------------------------------------------------------

--
-- Table structure for table `collage_master`
--

CREATE TABLE IF NOT EXISTS `collage_master` (
  `clg_reg_no` int(8) NOT NULL,
  `clg_name` varchar(60) NOT NULL,
  `adress` varchar(80) NOT NULL,
  `pincode` int(6) NOT NULL,
  `contact_no` varchar(10) NOT NULL,
  `mail_id` varchar(30) NOT NULL,
  PRIMARY KEY (`clg_reg_no`),
  UNIQUE KEY `clg_reg_no` (`clg_reg_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `collage_master`
--

INSERT INTO `collage_master` (`clg_reg_no`, `clg_name`, `adress`, `pincode`, `contact_no`, `mail_id`) VALUES
(11100001, 'Kumkum School', 'avakar hall,maninagar,\r\nahmedabad', 380015, '07586312', 'kumkum@gmail.com'),
(11100002, 'P.D pandya collage', 'nigam,\r\nghodasar,\r\nahmedabad', 380050, '0751523', 'pdpandya@hotmail.com'),
(11100003, 'muktjivan School', 'isanpur,\r\nahmedabad', 380045, '07536251', 'muktjivan11@yahoo.com'),
(11100004, 'ks school of business managment', 'navarangpura,\nahmedabad', 380045, '26281726', 'muktjivan11@yahoo.com'),
(11100005, 'st xeviers collage', 'navarangpura,ahmedabad', 380009, '22323224', 'xevierse@yahoo.com'),
(11100006, 'L.j institute ', 'sg road ,ahmedabad', 382947, '23678367', 'ljistitute@gmail.com'),
(11100007, 'H.L commerce collage', 'commerce six road,ahmedabad', 380009, '26371987', 'hlcommerce@gmail.com'),
(11100008, 'H k Arts collage', 'Ashram road,ahmedabad', 380009, '20133234', 'hkarts@gmail.com'),
(11100009, 'Nation institute of design', 'paldi,ahmedabad', 380007, '22748374', ' nationdesign@yahoo.com'),
(11100010, 'Sharda Vidyalaya', ' Jivraj Park, Ahmedabad ', 380051, '7893273829', 'sardavidhyalay@yahoo.com'),
(11100011, 'Shri Sahjanand Arts & Comm College', 'Ambavadi, Ahmedabad', 380015, '24445356', 'sahjanandcomm@gmail.com'),
(11100012, 'Takshashila Education College', 'Odhav, Ahmedabad', 382415, '24664432', 'takshshila@gmail.com'),
(11100013, 'Prakash College Of Education', 'Maruti Centre, Ahmedabad', 380000, '26377887', 'prakshalcollage@gmail.com'),
(11100014, 'Ehanes Vally College Of Technology', 'Nirnaya Nager, Ahmedabad', 380024, '26635677', 'ehanesvallycollage@gmail.com'),
(11100015, 'New Saurabh Higher Secondary School', 'Ghatlodiya, Ahmedabad', 380061, '22343456', 'sauraabhhighscool@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `complain`
--

CREATE TABLE IF NOT EXISTS `complain` (
  `complain_no` int(5) NOT NULL,
  `complainer_name` varchar(50) NOT NULL,
  `date` datetime NOT NULL,
  `question` varchar(80) NOT NULL,
  `answers` varchar(100) DEFAULT 'no',
  `contact_no` varchar(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  PRIMARY KEY (`complain_no`),
  UNIQUE KEY `complain_no` (`complain_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `complain`
--

INSERT INTO `complain` (`complain_no`, `complainer_name`, `date`, `question`, `answers`, `contact_no`, `email`) VALUES
(10001, 'viral patel', '2015-09-13 04:00:40', 'driver of bus no 16 misbehave with everyone.', 'we instuct to stop to do.', '8745123545', 'viralpatel26@yahoo.com'),
(10002, 'hardik solanki', '2015-09-14 03:15:27', 'in my pass my birt date in changed.', 'please come to office with id proof and we glade to update your pass.', '9578123252', 'hardik12@yahoo.com'),
(10003, 'darshan patel', '2015-10-24 05:19:15', 'bas time to time nathi aavati ?? 16 no  nigam society.', 'no', '9601140078', 'darshan26@gmail.com'),
(10004, 'chudasama viral', '2015-10-24 05:23:15', 'driver of 40/3 drive so fast and missbehave with students.', 'no', '7878451351', 'viralchudasama94@gmail.com'),
(10005, 'darshan pandya', '2015-11-27 08:56:42', 'hiii ahiugaus', 'no', '9978467366', 'darsh@yahoo.com');

-- --------------------------------------------------------

--
-- Table structure for table `deposit`
--

CREATE TABLE IF NOT EXISTS `deposit` (
  `passNo` int(6) NOT NULL,
  `loginID` varchar(12) NOT NULL,
  `price` float NOT NULL,
  `dateTime` datetime NOT NULL,
  `paymentBy` varchar(15) NOT NULL,
  `chaqueNo` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`passNo`),
  UNIQUE KEY `passNo` (`passNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deposit`
--

INSERT INTO `deposit` (`passNo`, `loginID`, `price`, `dateTime`, `paymentBy`, `chaqueNo`) VALUES
(175001, '2133211', 1550, '2015-07-03 03:11:12', 'cash', NULL),
(175002, '2133211', 2050, '2015-11-27 08:45:43', 'cash', ''),
(175003, '2133211', 650, '2015-11-27 02:24:09', 'cash', ''),
(175004, '2133211', 1050, '2015-11-27 02:30:14', 'chaque', '12367287'),
(175005, '2133211', 1050, '2015-11-27 02:30:51', 'cash', ''),
(175006, '2133211', 2050, '2015-11-27 03:26:38', 'cash', ''),
(175007, '2133136', 2550, '2015-11-30 11:58:50', 'cash', ''),
(175008, '2133136', 300, '2015-11-30 11:59:46', 'cash', ''),
(175009, '2133136', 950, '2015-12-01 12:00:18', 'cash', ''),
(175010, '2133211', 2050, '2015-12-01 12:20:48', 'cash', ''),
(175011, '2133211', 650, '2015-12-01 12:26:44', 'cash', ''),
(175012, '2133136', 2050, '2015-12-02 12:02:56', 'cash', ''),
(175013, '2133211', 2050, '2015-12-02 12:05:04', 'cash', ''),
(175014, '2133211', 2050, '2015-12-02 12:08:13', 'cash', ''),
(175015, '2133211', 2050, '2015-12-02 12:08:51', 'cash', ''),
(175016, '2133211', 2050, '2015-12-02 12:11:31', 'cash', ''),
(175017, '2133136', 2050, '2015-12-02 12:21:57', 'cash', ''),
(175018, '2133136', 2050, '2015-12-02 12:23:16', 'cash', ''),
(175019, '2133136', 2050, '2015-12-02 12:23:53', 'cash', ''),
(175020, '2133136', 2050, '2015-12-02 12:25:09', 'cash', ''),
(175021, '2133136', 2050, '2015-12-02 12:26:15', 'cash', ''),
(175022, '2133136', 2050, '2015-12-02 12:27:42', 'cash', ''),
(175023, '2133211', 2050, '2015-12-02 11:21:33', 'cash', ''),
(175024, '2133211', 2050, '2015-12-02 11:23:32', 'cash', ''),
(175025, '2133211', 2050, '2015-12-02 11:24:39', 'cash', ''),
(175026, '2133211', 2050, '2015-12-02 04:39:07', 'cash', ''),
(175027, '2133211', 2050, '2015-12-02 04:39:23', 'chaque', '2666616'),
(175028, '2133211', 3050, '2015-12-02 04:39:44', 'chaque', '2666616'),
(175029, '2133211', 950, '2015-12-02 04:56:36', 'cash', ''),
(175030, '2133211', 2050, '2015-12-02 04:56:50', 'cash', ''),
(175031, '2133136', 3050, '2015-12-02 04:59:56', 'chaque', 'wdwd23265'),
(175032, '2133136', 2050, '2015-12-02 05:01:32', 'cash', ''),
(175033, '2133211', 2050, '2015-12-02 05:02:25', 'cash', ''),
(175034, '2133211', 2050, '2015-12-02 05:04:42', 'cash', ''),
(175035, '2133211', 2050, '2015-12-02 05:06:12', 'cash', ''),
(175036, '2133211', 2050, '2015-12-02 05:08:23', 'cash', ''),
(175037, '2133136', 2050, '2015-12-02 05:12:32', 'cash', ''),
(175038, '2133136', 2050, '2015-12-04 01:32:45', 'cash', ''),
(175039, '2133211', 650, '2015-12-04 06:19:07', 'cash', ''),
(175040, '2133211', 650, '2015-12-12 07:21:54', 'cash', ''),
(175041, '2133211', 650, '2015-12-12 07:22:03', 'cash', ''),
(175042, '2133211', 2050, '2015-12-12 07:55:49', 'cash', ''),
(175043, '2133211', 2050, '2015-12-12 07:57:22', 'cash', ''),
(175044, '2133211', 2050, '2015-12-12 07:59:51', 'cash', ''),
(175045, '2133211', 2050, '2015-12-12 08:01:21', 'cash', ''),
(175046, '2133211', 2050, '2015-12-12 08:03:47', 'cash', ''),
(175047, '2133211', 2050, '2015-12-12 08:06:30', 'cash', ''),
(175048, '2133211', 2050, '2015-12-12 08:07:32', 'cash', ''),
(175049, '2133211', 2050, '2015-12-12 08:09:03', 'cash', ''),
(175050, '2133211', 2050, '2015-12-12 08:12:10', 'cash', ''),
(175051, '2133211', 2050, '2015-12-12 08:13:30', 'cash', ''),
(175052, '1', 2050, '2015-12-12 08:20:01', 'cash', ''),
(175053, '1', 2050, '2015-12-12 08:22:14', 'cash', ''),
(175054, '1', 2050, '2015-12-12 08:25:05', 'cash', ''),
(175055, '2133211', 2050, '2015-12-12 08:32:44', 'cash', ''),
(175056, '1', 2050, '2015-12-13 01:07:51', 'cash', ''),
(175057, '1', 2050, '2015-12-13 01:08:16', 'cash', ''),
(175058, '1', 2050, '2015-12-13 01:36:09', 'cash', ''),
(175059, '1', 100, '2015-12-13 02:00:45', 'cash', ''),
(175060, '2133136', 2050, '2015-12-17 08:59:42', 'cash', ''),
(175061, '2133136', 1050, '2015-12-17 09:01:31', 'chaque', '1154541'),
(175062, '2133136', 2050, '2015-12-17 09:02:56', 'cash', ''),
(175063, '2133136', 2050, '2015-12-17 09:08:56', 'cash', ''),
(175064, '2133136', 2050, '2015-12-17 09:11:18', 'cash', ''),
(175065, '2133136', 2050, '2015-12-17 02:07:06', 'cash', ''),
(175066, '2133136', 100, '2015-12-17 02:12:12', 'cash', '');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `login_id` varchar(12) NOT NULL,
  `proof_id` int(5) NOT NULL,
  `id_no` bigint(12) NOT NULL,
  `password` varchar(20) NOT NULL,
  `type` varchar(6) NOT NULL DEFAULT 'user',
  `status` varchar(2) NOT NULL DEFAULT 'AC',
  `join_date` date NOT NULL,
  `designation` varchar(20) NOT NULL,
  `contact_no` varchar(10) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `security_q1` varchar(50) NOT NULL,
  `security_q2` varchar(50) NOT NULL,
  `ans_1` varchar(20) NOT NULL,
  `ans_2` varchar(20) NOT NULL,
  PRIMARY KEY (`login_id`),
  UNIQUE KEY `login_id` (`login_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`login_id`, `proof_id`, `id_no`, `password`, `type`, `status`, `join_date`, `designation`, `contact_no`, `email`, `security_q1`, `security_q2`, `ans_1`, `ans_2`) VALUES
('2133136', 10001, 100000000002, '3136', 'admin', 'AC', '2014-01-01', 'manager', '9586301757', 'deepakprajapati589@gmail.com', 'what is favorite food?', 'what is nick name?', 'pizza', 'deep'),
('2133137', 10001, 100000000002, '3137', 'user', 'AC', '2014-01-01', 'employee', '8574625748', 'heymail@yahoo.com', 'what is favorite food?', 'what is nick name?', 'milk', 'bhailu'),
('2133211', 10001, 100000000003, '3211', 'user', 'AC', '2014-03-19', 'employee', '9601140078', 'darshan26@gmail.com', 'what is favorite food?', 'what is nick name?', 'pizza', 'deep'),
('2133212', 10001, 100000000020, '3212', 'user', 'AC', '2015-07-07', 'employee', '9271837223', 'snjay@gmail.com', 'what is favorite food?', 'what is nick name?', 'milk', 'bhailu'),
('2133213', 10001, 100000000005, '3213', 'user', 'AC', '2014-03-19', 'employee', '9586472615', 'vatsalrami@gmail.com', 'what is favorite food?', 'what is nick name?', 'pizza', 'deep'),
('2133215', 10001, 100000000008, '3215', 'user', 'AC', '2014-03-19', 'employee', '9878673545', 'yashtri@gmail.com', 'what is favorite food?', 'what is nick name?', 'pizza', 'deep'),
('2133216', 10001, 110000000008, '3216', 'user', 'AC', '2014-03-19', 'employee', '9277777223', 'dhaval26@gmail.com', 'what is favorite food?', 'what is nick name?', 'pizza', 'deep'),
('2133217', 10001, 110000000008, '3216', 'user', 'AC', '2015-07-07', 'employee', '7848753515', 'mahesh24@gmail.com', 'what is favorite food?', 'what is nick name?', 'milk', 'bhailu'),
('2133218', 10001, 110000000010, '3217', 'user', 'AC', '2014-03-19', 'employee', '8888837223', 'bhagvan226@gmail.com', 'what is favorite food?', 'what is nick name?', 'pizza', 'deep'),
('2133219', 10001, 110000000011, '3218', 'user', 'AC', '2015-07-07', 'employee', '9271837223', 'thakorrahul@gmail.com', 'what is favorite food?', 'what is nick name?', 'milk', 'bhailu'),
('2133220', 10001, 110000000020, '3220', 'user', 'AC', '2014-03-19', 'employee', '9271877777', 'makparmar26@gmail.com', 'what is favorite food?', 'what is nick name?', 'pizza', 'deep'),
('2133221', 10001, 110000000021, '3221', 'user', 'AC', '2015-07-07', 'employee', '7894738882', 'vishvesh114@gmail.com', 'what is favorite food?', 'what is nick name?', 'milk', 'bhailu'),
('2133222', 10001, 110000000022, '3222', 'user', 'NA', '2014-03-19', 'employee', '7778849374', 'vats256@gmail.com', 'what is favorite food?', 'what is nick name?', 'pizza', 'deep'),
('2133223', 10001, 110000000023, '3223', 'user', 'AC', '2015-07-07', 'employee', '7878747578', 'naman78@gmail.com', 'what is favorite food?', 'what is nick name?', 'milk', 'bhailu'),
('2133224', 10001, 110000000024, '3224', 'user', 'NA', '2014-03-19', 'employee', '9271837223', 'sohampatel26@gmail.com', 'what is favorite food?', 'what is nick name?', 'pizza', 'deep'),
('2133225', 10001, 110000000025, '3225', 'user', 'AC', '2015-07-07', 'employee', '9993647883', 'saurabhparrmar@gmail.com', 'what is favorite food?', 'what is nick name?', 'milk', 'bhailu'),
('2133226', 10001, 110000000026, '3226', 'user', 'AC', '2014-03-19', 'employee', '9271837223', 'vasudevjoshi@gmail.com', 'what is favorite food?', 'what is nick name?', 'pizza', 'deep');

-- --------------------------------------------------------

--
-- Table structure for table `pass`
--

CREATE TABLE IF NOT EXISTS `pass` (
  `pass_no` int(6) NOT NULL,
  `fullName` varchar(50) NOT NULL,
  `dob` date NOT NULL,
  `pic` varchar(80) NOT NULL,
  `adress` varchar(80) NOT NULL,
  `pincode` int(6) NOT NULL,
  `contactNo` varchar(10) NOT NULL,
  `pass_id` int(5) NOT NULL,
  `proof_id` int(4) NOT NULL,
  `id_no` bigint(12) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `price` float NOT NULL,
  `renew_no` int(6) DEFAULT NULL,
  PRIMARY KEY (`pass_no`),
  UNIQUE KEY `pass_no` (`pass_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pass`
--

INSERT INTO `pass` (`pass_no`, `fullName`, `dob`, `pic`, `adress`, `pincode`, `contactNo`, `pass_id`, `proof_id`, `id_no`, `start_date`, `end_date`, `price`, `renew_no`) VALUES
(175001, 'deepak p prajapati', '1995-11-03', 'D:\\Project\\images\\128_128\\6.png', '175,dhrambhoomi soc,\np.d pandya collage road,\nghodassar,ahmedabad', 380050, '9586301757', 11001, 1008, 26260003, '2015-07-03', '2015-11-30', 1550, NULL),
(175002, 'jayes v thakkar', '2000-09-14', '/amts/images/128_128/6.jpg', 'v-5/janpath soc,ranip,ahmedabad', 380175, '9271837223', 11003, 1003, 1000000006, '2015-11-27', '2016-02-29', 2050, 0),
(175003, 'anuj k thakkar', '2000-04-18', '/amts/images/128_128/6.jpg', '7/rajapath banglow,vatva,ahmedabad', 380050, '9271837233', 11001, 1008, 26260006, '2015-11-27', '2015-12-31', 650, 0),
(175004, 'tapan p pandya', '1990-03-17', '/amts/images/128_128/8.jpg', '68/rajapath banglows,near nigam,ghodasar,ahmedabada', 380175, '9271837289', 11003, 1001, 100000000009, '2015-11-27', '2015-12-31', 1050, 0),
(175005, 'anuj k thakkar', '1954-03-17', '/amts/images/128_128/9.jpg', '7/rajapath banglow,vatva,ahmedabad', 380175, '9271837233', 11003, 1001, 100000000010, '2015-11-27', '2015-12-31', 1050, 0),
(175006, 'yash p tripathi', '2000-03-10', '/amts/images/128_128/7.jpg', '6/rajapath banglows,near nigam,ghodasar,ahmedabada', 380175, '9878673545', 11003, 1001, 100000000008, '2015-11-27', '2016-02-29', 2050, 0),
(175007, 'narendra d prikh', '1999-05-07', '/amts/images/128_128/11.jpg', '232b/vadilalnagar,paldi,ahmedabad', 380175, '9271837223', 11003, 1003, 1000000011, '2015-11-30', '2016-03-31', 2550, 0),
(175008, 'manoj n trivedi', '1952-02-11', '/amts/images/128_128/19.jpg', '45/jogeshvari soc,paldi,ahmedabad', 380175, '9271837223', 11002, 1001, 100000000024, '2015-11-30', '2016-03-31', 300, 0),
(175009, 'vipul m dabhi', '2000-08-17', '/amts/images/128_128/22.jpg', '5/vinodnagar soc,isanpur,ahmedabad', 380051, '8978984455', 11001, 1008, 26260022, '2015-12-01', '2016-02-29', 950, 0),
(175010, 'chirag j vaghela', '2000-08-16', '/amts/images/128_128/36.jpg', 'v-5/janpath soc,ranip,ahmedabad', 380007, '7763623722', 11003, 1003, 1000000036, '2015-12-01', '2016-03-31', 2050, 0),
(175011, 'manoj n trivedi', '2000-12-20', '/amts/images/128_128/27.jpg', '45/jogeshvari soc,paldi,ahmedabad', 380051, '9271837223', 11001, 1008, 26260026, '2015-12-01', '2016-01-31', 650, 0),
(175012, 'kinjal d dave', '1999-06-06', '/amts/images/128_128/27.jpg', '8/tirthay flat,kalupur,ahmedabad', 380175, '7888787223', 11003, 1003, 1000000030, '2015-12-02', '2016-03-31', 2050, 0),
(175013, 'jaya n pandit', '2000-12-20', '/amts/images/128_128/15.jpg', '8/tirthay flat,vadaj,ahmedabad', 380175, '8967898789', 11003, 1003, 1000000015, '2015-12-02', '2016-03-31', 2050, 0),
(175014, 'ayesh a pandit', '1999-09-08', '/amts/images/128_128/19.jpg', 'b-4/jogeshvari soc,jasoda,ahmedabad', 380175, '9262383223', 11003, 1003, 1000000020, '2015-12-02', '2016-03-31', 2050, 0),
(175015, 'deep n patel', '1990-05-02', '/amts/images/128_128/20.jpg', '18/vishvakarma soc,narol,ahmedabad', 380175, '9271838294', 11003, 1003, 1000000021, '2015-12-02', '2016-03-31', 2050, 0),
(175016, ' vishvesh s pandya ', '2000-12-20', '/amts/images/128_128/29.jpg', '2-narayan nagar,navarangpura,ahmedabad', 380050, '998787289', 11003, 1003, 1000000032, '2015-12-02', '2016-03-31', 2050, 0),
(175017, 'drashti n shah', '2000-04-05', '/amts/images/128_128/12.jpg', '23/bhagvan nagar,paldi,ahmedabad', 380175, '9271837223', 11003, 1003, 1000000012, '2015-12-02', '2016-03-31', 2050, 0),
(175018, 'chirag j vaghela', '2000-08-16', '/amts/images/128_128/36.jpg', 'v-5/janpath soc,ranip,ahmedabad', 380007, '7763623722', 11003, 1003, 1000000036, '2015-12-02', '2016-03-31', 2050, 0),
(175019, 'romesh p varma ', '2001-11-09', '/amts/images/128_128/35.jpg', '11 siddharth soc,paldi,ahmedabad', 389289, '8927828882', 11003, 1001, 100000000041, '2015-12-02', '2016-03-31', 2050, 0),
(175020, 'harivadhan a rami', '1999-08-05', '/amts/images/128_128/38.jpg', '4 swaminarayan soc,choras gam,ahmedabad', 380175, '9272227289', 11003, 1003, 1000000038, '2015-12-02', '2016-03-31', 2050, 0),
(175021, 'drashti n shah', '2000-04-05', '/amts/images/128_128/12.jpg', '23/bhagvan nagar,paldi,ahmedabad', 380175, '9271837223', 11003, 1003, 1000000012, '2015-12-02', '2016-03-31', 2050, 0),
(175022, 'vijay j chauhan', '1995-10-24', '/amts/images/128_128/4.jpg', '15,sarthsk apartment,\r\nnigam,\r\nghodasar,ahmedabad', 380050, '8513647523', 11003, 1003, 1000000004, '2015-12-02', '2016-03-31', 2050, 0),
(175023, 'anuj k thakkar', '2000-03-17', '/amts/images/128_128/24.jpg', '7/rajapath banglow,vatva,ahmedabad', 380175, '7773333723', 11003, 1003, 1000000026, '2015-12-02', '2016-03-31', 2050, 0),
(175024, 'jay  v patel', '1990-10-03', '/amts/images/128_128/23.jpg', '28/radhavallabh soc,paldi,ahmedabad', 380175, '9271846464', 11003, 1003, 1000000025, '2015-12-02', '2016-03-31', 2050, 0),
(175025, ' vishvesh s pandya ', '2000-12-20', '/amts/images/128_128/29.jpg', '2-narayan nagar,navarangpura,ahmedabad', 380050, '998787289', 11003, 1003, 1000000032, '2015-12-02', '2016-03-31', 2050, 0),
(175026, 'sanjana n raval', '1999-07-09', '/amts/images/128_128/21.jpg', '8/vikasharth soc,narol,ahmedabad', 380051, '789897289', 11003, 1003, 1000000022, '2015-12-02', '2016-03-31', 2050, 0),
(175027, 'narendra d prikh', '1999-05-07', '/amts/images/128_128/9.jpg', '232b/vadilalnagar,paldi,ahmedabad', 380175, '9271837223', 11003, 1003, 1000000009, '2015-12-02', '2016-03-31', 2050, 0),
(175028, 'khushi s trivedi', '1999-12-17', '/amts/images/128_128/23.jpg', '232b/vadilalnagar,paldi,ahmedabad', 380175, '9271837223', 11003, 1001, 100000000028, '2015-12-02', '2016-05-31', 3050, 0),
(175029, 'mahesh v thakkar', '2000-12-08', '/amts/images/128_128/26.jpg', '53/janakpuri soc,ghodasar,ahmedabad', 380051, '9271837223', 11001, 1008, 26260025, '2015-12-02', '2016-02-29', 950, 0),
(175030, 'anuj k thakkar', '2000-03-17', '/amts/images/128_128/24.jpg', '7/rajapath banglow,vatva,ahmedabad', 380175, '7773333723', 11003, 1003, 1000000026, '2015-12-02', '2016-03-31', 2050, 0),
(175031, 'anuj k thakkar', '2000-03-17', '/amts/images/128_128/24.jpg', '7/rajapath banglow,vatva,ahmedabad', 380175, '7773333723', 11003, 1003, 1000000026, '2015-12-02', '2016-05-31', 3050, 0),
(175032, 'anil p vyash ', '1996-06-19', '/amts/images/128_128/30.jpg', 'A215 ishvarnagar,sarkhej,ahmedabad', 380175, '8888899833', 11003, 1003, 1000000033, '2015-12-02', '2016-03-31', 2050, 0),
(175033, 'kinju d dave', '1999-10-06', '/amts/images/128_128/21.jpg', '6-c/bhavani soc,chandranagar,ahmedabad', 380175, '9271837223', 11003, 1001, 100000000026, '2015-12-02', '2016-03-31', 2050, 0),
(175034, 'vishal b joshi ', '2001-02-11', '/amts/images/128_128/39.jpg', 'n13 mahespati sco,punitnagar,ahmedabad', 380175, '888899999', 11003, 1003, 1000000039, '2015-12-02', '2016-03-31', 2050, 0),
(175035, 'khushi s trivedi', '1999-12-17', '/amts/images/128_128/8.jpg', '232b/vadilalnagar,paldi,ahmedabad', 380175, '9271837223', 11003, 1003, 1000000008, '2015-12-02', '2016-03-31', 2050, 0),
(175036, 'pratap k mandeliya', '2000-05-17', '/amts/images/128_128/7.jpg', '8/janpath soc,paldi,ahmedabad', 380175, '9271563434', 11003, 1003, 1000000007, '2015-12-02', '2016-03-31', 2050, 0),
(175037, 'vatsal h rami', '0151-09-15', '/amts/images/128_128/5.jpg', '2-b,akksah flats,\r\nnaroda,ahmedabad', 380175, '9586472615', 11003, 1002, 1000000005, '2015-12-02', '2016-03-31', 2050, 0),
(175038, 'vijay j chauhan', '1955-10-24', '/amts/images/128_128/4.jpg', '15,sarthsk apartment,\r\nnigam,\r\nghodasar,ahmedabad', 380050, '8513647523', 11003, 1001, 100000000004, '2015-12-04', '2016-03-31', 2050, 0),
(175039, 'deepak p prajapati', '1995-11-03', '/amts/images/128_128/44.jpg', '175,dharmbhoomi,\r\np d pandya collage,nigam,\r\nghodasar,ahmedabad', 380050, '9586301757', 11001, 1008, 26260003, '2015-12-04', '2016-01-31', 650, 0),
(175040, 'jaydeep v vaghela', '2000-10-12', '/amts/images/128_128/15.jpg', 'c-8/rajpath soc,paldi,ahmedabad', 380051, '7893273829', 11001, 1008, 26260015, '2015-12-12', '2016-01-31', 650, 0),
(175041, 'anuj k thakkar', '2000-04-18', '/amts/images/128_128/6.jpg', '7/rajapath banglow,vatva,ahmedabad', 380050, '9271837233', 11001, 1008, 26260006, '2015-12-12', '2016-01-31', 650, 0),
(175042, 'sanjana n raval', '1999-07-09', '/amts/images/128_128/21.jpg', '8/vikasharth soc,narol,ahmedabad', 380051, '789897289', 11003, 1002, 1000000022, '2015-12-12', '2016-03-31', 2050, 0),
(175043, 'sanjana n raval', '1999-07-09', '/amts/images/128_128/21.jpg', '8/vikasharth soc,narol,ahmedabad', 380051, '789897289', 11003, 1002, 1000000022, '2015-12-12', '2016-03-31', 2050, 0),
(175044, 'jaya n pandit', '2000-12-20', '/amts/images/128_128/15.jpg', '8/tirthay flat,vadaj,ahmedabad', 380175, '8967898789', 11003, 1002, 1000000015, '2015-12-12', '2016-03-31', 2050, 0),
(175045, 'anuj k thakkar', '2000-03-17', '/amts/images/128_128/24.jpg', '7/rajapath banglow,vatva,ahmedabad', 380175, '7773333723', 11003, 1002, 1000000026, '2015-12-12', '2016-03-31', 2050, 0),
(175046, 'vijay j chauhan', '1995-10-24', '/amts/images/128_128/4.jpg', '15,sarthsk apartment,\r\nnigam,\r\nghodasar,ahmedabad', 380050, '8513647523', 11003, 1002, 1000000004, '2015-12-12', '2016-03-31', 2050, 0),
(175047, 'drashti n shah', '2000-12-11', '/amts/images/128_128/20.jpg', '23/bhagvan nagar,paldi,ahmedabad', 380175, '9271837223', 11003, 1001, 100000000025, '2015-12-12', '2016-03-31', 2050, 0),
(175048, 'sanjana n raval', '1999-07-09', '/amts/images/128_128/21.jpg', '8/vikasharth soc,narol,ahmedabad', 380051, '789897289', 11003, 1002, 1000000022, '2015-12-12', '2016-03-31', 2050, 0),
(175049, 'jaya n pandit', '2000-12-20', '/amts/images/128_128/17.jpg', '8/tirthay flat,vadaj,ahmedabad', 380175, '8967898789', 11003, 1001, 100000000022, '2015-12-12', '2016-03-31', 2050, 0),
(175050, 'vinod j joshi', '2000-12-20', '/amts/images/128_128/21.jpg', '18/j vidhyanagar,ahmedabad', 380175, '926667223', 11003, 1002, 1000000023, '2015-12-12', '2016-03-31', 2050, 0),
(175051, 'viral b patel', '1996-03-12', '/amts/images/128_128/1.jpg', '23,shreeji park,\r\nghodasar,ahmedabad', 380045, '9726014875', 11003, 1002, 1000000001, '2015-12-12', '2016-03-31', 2050, 0),
(175052, 'vatsal h rami', '0151-09-15', '/amts/images/128_128/5.jpg', '2-b,akksah flats,\r\nnaroda,ahmedabad', 380175, '9586472615', 11003, 1002, 1000000005, '2015-12-12', '2016-03-31', 2050, 0),
(175053, 'khushi s trivedi', '1999-12-17', '/amts/images/128_128/8.jpg', '232b/vadilalnagar,paldi,ahmedabad', 380175, '9271837223', 11003, 1002, 1000000008, '2015-12-12', '2016-03-31', 2050, 0),
(175054, 'vatsal h rami', '0151-09-15', '/amts/images/128_128/5.jpg', '2-b,akksah flats,\r\nnaroda,ahmedabad', 380175, '9586472615', 11003, 1002, 1000000005, '2015-12-12', '2016-03-31', 2050, 0),
(175055, 'vatsal h rami', '0151-09-15', '/amts/images/128_128/5.jpg', '2-b,akksah flats,\r\nnaroda,ahmedabad', 380175, '9586472615', 11003, 1002, 1000000005, '2015-12-12', '2016-03-31', 2050, 0),
(175056, 'deep n patel', '1990-05-02', '/amts/images/128_128/20.jpg', '18/vishvakarma soc,narol,ahmedabad', 380175, '9271838294', 11003, 1002, 1000000021, '2015-12-13', '2016-03-31', 2050, 0),
(175057, 'vatsal h rami', '0151-09-15', '/amts/images/128_128/5.jpg', '2-b,akksah flats,\r\nnaroda,ahmedabad', 380175, '9586472615', 11003, 1002, 1000000005, '2015-12-13', '2016-03-31', 2050, 0),
(175058, 'chirag j vaghela', '2000-08-16', '/amts/images/128_128/36.jpg', 'v-5/janpath soc,ranip,ahmedabad', 380007, '7763623722', 11003, 1002, 1000000036, '2015-12-13', '2016-03-31', 2050, 0),
(175059, 'anuj k thakkar', '1954-03-17', '/amts/images/128_128/9.jpg', '7/rajapath banglow,vatva,ahmedabad', 380175, '9271837233', 11002, 1001, 100000000010, '2015-12-13', '2015-12-31', 100, 0),
(175060, 'harshil c pandit', '2001-02-09', '/amts/images/128_128/10.jpg', '28/janpath soc.,banglow,paldi,ahmedabad', 380175, '9273334223', 11003, 1001, 100000000012, '2015-12-17', '2016-03-31', 2050, 0),
(175061, 'vatsal h rami', '0151-09-15', '/amts/images/128_128/5.jpg', '2-b,akksah flats,\r\nnaroda,ahmedabad', 380175, '9586472615', 11003, 1002, 1000000005, '2015-12-17', '2016-01-31', 1050, 0),
(175062, 'viral b patel', '1996-03-12', '/amts/images/128_128/1.jpg', '23,shreeji park,\r\nghodasar,ahmedabad', 380045, '9726014875', 11003, 1002, 1000000001, '2015-12-17', '2016-03-31', 2050, 0),
(175063, 'viajy n vaghela', '2000-08-16', '/amts/images/128_128/17.jpg', 'b-5/maheshvari soc,narol,ahmedabad', 380175, '9271837555', 11003, 1002, 1000000017, '2015-12-17', '2016-03-31', 2050, 0),
(175064, 'jaya n pandit', '2000-12-20', '/amts/images/128_128/15.jpg', '8/tirthay flat,vadaj,ahmedabad', 380175, '8967898789', 11003, 1002, 1000000015, '2015-12-17', '2016-03-31', 2050, 0),
(175065, 'vijay j chauhan', '1995-10-24', '/amts/images/128_128/4.jpg', '15,sarthsk apartment,\r\nnigam,\r\nghodasar,ahmedabad', 380050, '8513647523', 11003, 1002, 1000000004, '2015-12-17', '2016-03-31', 2050, 0),
(175066, 'deepak p prajapati', '1955-11-03', '/amts/images/128_128/44.jpg', '175,dharmbhoomi soc,\r\nghodasar,ahmdabad', 380050, '9586301757', 11002, 1002, 1000000002, '2015-12-17', '2015-12-31', 100, 0);

-- --------------------------------------------------------

--
-- Table structure for table `pass_mast`
--

CREATE TABLE IF NOT EXISTS `pass_mast` (
  `pass_id` int(5) NOT NULL,
  `type` varchar(20) NOT NULL,
  `cost_per_month` float NOT NULL,
  PRIMARY KEY (`pass_id`),
  UNIQUE KEY `pass_id` (`pass_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pass_mast`
--

INSERT INTO `pass_mast` (`pass_id`, `type`, `cost_per_month`) VALUES
(11001, 'student pass', 300),
(11002, 'senior citizen pass', 50),
(11003, 'genral pass', 500);

-- --------------------------------------------------------

--
-- Table structure for table `proof_master`
--

CREATE TABLE IF NOT EXISTS `proof_master` (
  `proof_id` int(4) NOT NULL,
  `proof_type` varchar(20) NOT NULL,
  PRIMARY KEY (`proof_id`),
  UNIQUE KEY `proof_id` (`proof_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `proof_master`
--

INSERT INTO `proof_master` (`proof_id`, `proof_type`) VALUES
(1001, 'adhar_card'),
(1002, 'voter_card'),
(1003, 'pan_card'),
(1008, 'student');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `GRNO` int(8) NOT NULL,
  `clg_reg_no` int(8) NOT NULL,
  `f_name` varchar(20) NOT NULL,
  `m_name` varchar(20) NOT NULL,
  `l_name` varchar(20) NOT NULL,
  `pic` varchar(30) NOT NULL,
  `dob` date NOT NULL,
  `adress` varchar(80) NOT NULL,
  `pincode` int(6) NOT NULL,
  `gen` varchar(6) NOT NULL,
  `stream` varchar(20) NOT NULL,
  `acadamic_year` varchar(10) NOT NULL,
  `contact_no` varchar(10) NOT NULL,
  PRIMARY KEY (`GRNO`),
  UNIQUE KEY `GRNO` (`GRNO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`GRNO`, `clg_reg_no`, `f_name`, `m_name`, `l_name`, `pic`, `dob`, `adress`, `pincode`, `gen`, `stream`, `acadamic_year`, `contact_no`) VALUES
(26260001, 11100002, 'patel', 'harshil', 'vinod bhai', '/amts/images/128_128/1.jpg', '1996-01-26', '17,vrundavan park,\r\nnigam,ghodasar,\r\nahmedabad', 380050, 'male', 'science', '2014-2015', '9601140078'),
(26260002, 11100001, 'patel', 'viral', 'bharat bhai', '/amts/images/128_128/2.jpg', '1996-03-15', '45-b shreeji park,\r\nnigam,ghodasar,\r\nahmedabad', 380050, 'male', 'commerce', '2015-2016', '9724601178'),
(26260003, 11100001, 'prajapati', 'deepak', 'pratap bhai', '/amts/images/128_128/44.jpg', '1995-11-03', '175,dharmbhoomi,\r\np d pandya collage,nigam,\r\nghodasar,ahmedabad', 380050, 'male', 'commerce', '2015-2016', '9586301757'),
(26260004, 11100002, 'tripathi', 'yash', 'parshkumar', '/amts/images/128_128/4.jpg', '2000-03-10', '6/vandevi banglows,near nigam,ghodasar,ahmedabad', 380050, 'male', 'commerce', '2015-2016', '9271837273'),
(26260005, 11100001, 'pandya', 'tapan', 'parshkumar', '/amts/images/128_128/5.jpg', '2000-03-10', '6/rajapath banglows,near nigam,ghodasar,ahmedabada', 380050, 'male', 'commerce', '2015-2016', '9271837289'),
(26260006, 11100002, 'thakkar', 'anuj', 'kamleshkumar', '/amts/images/128_128/6.jpg', '2000-04-18', '7/rajapath banglow,vatva,ahmedabad', 380050, 'male', 'commerce', '2015-2016', '9271837233'),
(26260007, 11100001, 'pandit', 'ayush', 'narendrabhai', '/amts/images/128_128/7.jpg', '2000-05-17', '28/rajapath banglow,vatva,ahmedabad', 380050, 'male', 'commerce', '2015-2016', '9273333233'),
(26260008, 11100003, 'pandit', 'harshil', 'chandubhai', '/amts/images/128_128/8.jpg', '2001-02-09', '28/janpath soc.,banglow,paldi,ahmedabad', 380050, 'male', 'scince', '2015-2016', '9273334223'),
(26260009, 11100002, 'patel', 'jay', 'vikashbhai', '/amts/images/128_128/9.jpg', '2000-10-03', '8/radhavallabh soc,paldi,ahmedabad', 380051, 'male', 'scince', '2015-2016', '9821837223'),
(26260010, 11100002, 'patel', 'akash', 'nileshbhai', '/amts/images/128_128/10.jpg', '2000-11-10', '10/ratnadeep soc,ghodasar,ahmedabad', 380051, 'male', 'scince', '2015-2016', '9954837223'),
(26260011, 11100002, 'joshi', 'vinod', 'jayendrabhai', '/amts/images/128_128/11.jpg', '2000-12-20', '8/jan vidhyanagar,ahmedabad', 380051, 'male', 'scince', '2015-2016', '8971837223'),
(26260012, 11100002, 'joshi', 'viraj', 'ayushbhai', '/amts/images/128_128/12.jpg', '2000-12-13', '8/madhav soc,paldi,ahmedabad', 380051, 'male', 'scince', '2015-2016', '7806637223'),
(26260013, 11100002, 'vaghela', 'jyoti', 'deepakbhai', '/amts/images/128_128/13.jpg', '2000-09-06', '80/janpath soc,paldi,ahmedabad', 380051, 'female', 'scince', '2015-2016', '9271880970'),
(26260014, 11100002, 'pandit', 'jayesh', 'jaybhai', '/amts/images/128_128/14.jpg', '2000-12-20', 'b-4/jogeshvari soc,jasoda,ahmedabad', 380051, 'male', 'scince', '2015-2016', '7896756789'),
(26260015, 11100002, 'vaghela', 'jaydeep', 'vijaybhai', '/amts/images/128_128/15.jpg', '2000-10-12', 'c-8/rajpath soc,paldi,ahmedabad', 380051, 'male', 'scince', '2015-2016', '7893273829'),
(26260016, 11100002, 'patel', 'deep', 'nishitbhai', '/amts/images/128_128/16.jpg', '2000-12-20', '18/vishvakarma soc,narol,ahmedabad', 380051, 'male', 'scince', '2015-2016', '8937284923'),
(26260017, 11100002, 'raval', 'sanjana', 'nileshbhai', '/amts/images/128_128/17.jpg', '2000-12-20', '8/vikasharth soc,narol,ahmedabad', 380051, 'female', 'scince', '2015-2016', '9898378373'),
(26260018, 11100002, 'pandya', 'sanjay', 'jighneshbhaoi', '/amts/images/128_128/18.jpg', '2000-12-20', '10/agamnigam soc,isanpur,ahmedabad', 380051, 'male', 'scince', '2015-2016', '9271837223'),
(26260019, 11100002, 'vaghela', 'viajy', 'neelbhai', '/amts/images/128_128/19.jpg', '2000-12-20', 'b-5/maheshvari soc,narol,ahmedabad', 380051, 'male', 'scince', '2015-2016', '8937283728'),
(26260020, 11100002, 'dabhi', 'darshan', 'nikunjbhai', '/amts/images/128_128/20.jpg', '2000-12-09', '77/path flat,]ghodasar,ahmedabad', 380051, 'male', 'scince', '2015-2016', '7895898598'),
(26260021, 11100002, 'pandit', 'jaya', 'jayeshbhai', '/amts/images/128_128/21.jpg', '2000-12-20', '8/tirthay flat,vadaj,ahmedabad', 380051, 'female', 'scince', '2015-2016', '8967898789'),
(26260022, 11100002, 'dabhi', 'vipul', 'mahendrabhai', '/amts/images/128_128/22.jpg', '2000-08-17', '5/vinodnagar soc,isanpur,ahmedabad', 380051, 'male', 'scince', '2015-2016', '8978984455'),
(26260023, 11100002, 'patel', 'sneh', 'mitbhai', '/amts/images/128_128/23.jpg', '2000-09-14', '12/sarswati banglows,vasna,ahmedabad', 380051, 'male', 'scince', '2015-2016', '9556778708'),
(26260024, 11100002, 'raval', 'jighnesh', 'meetbhai', '/amts/images/128_128/25.jpg', '2001-01-26', '8-b/ramnagar,vasana,ahmedabad', 380051, 'male', 'scince', '2015-2016', '8977332479'),
(26260025, 11100002, 'thakkar', 'mahesh', 'vikashbhai', '/amts/images/128_128/26.jpg', '2000-12-08', '53/janakpuri soc,ghodasar,ahmedabad', 380051, 'male', 'scince', '2015-2016', '9271837223'),
(26260026, 11100002, 'trivedi', 'manoj', 'nileshbhai', '/amts/images/128_128/27.jpg', '2000-12-20', '45/jogeshvari soc,paldi,ahmedabad', 380051, 'male', 'scince', '2015-2016', '9271837223'),
(26260027, 11100002, 'shah', 'drashti', 'niravbhai', '/amts/images/128_128/28.jpg', '2000-12-20', '23/bhagvan nagar,paldi,ahmedabad', 380051, 'female', 'scince', '2015-2016', '9271837223'),
(26260028, 11100002, 'pandit', 'vikash', 'virenbhai', '/amts/images/128_128/29.jpg', '2000-12-20', '8/kshitij appartment,paldi,ahmedabad', 380051, 'male', 'scince', '2015-2016', '9271837223'),
(26260029, 11100002, 'shah', 'mansi', 'hirenbhai', '/amts/images/128_128/30.jpg', '2000-12-20', 'b32/vinayak nagar,memnagar,ahmedabad', 380051, 'female', 'scince', '2015-2016', '9271837223'),
(26260030, 11100002, 'dave', 'kinju', 'dipenkumar', '/amts/images/128_128/31.jpg', '2000-12-20', '6-c/bhavani soc,chandranagar,ahmedabad', 380051, 'female', 'scince', '2015-2016', '9271837223'),
(26260031, 11100002, 'prajapati', 'deepak', 'dipenbhai', '/amts/images/128_128/32.jpg', '2000-12-20', '2/jmahipat soc,vasana,ahmedabad', 380051, 'male', 'scince', '2015-2016', '9271837223'),
(26260032, 11100002, 'prikh', 'narendra', 'divyeshbahi', '/amts/images/128_128/33.jpg', '2000-12-20', '32b/vadilalnagar,paldi,ahmedabad', 380051, 'male', 'scince', '2015-2016', '9271837223'),
(26260033, 11100002, 'mandeliya', 'yash', 'rameshbhai', '/amts/images/128_128/34.jpg', '2000-12-20', '8/janpath soc,paldi,ahmedabad', 380051, 'male', 'scince', '2015-2016', '9271837223'),
(26260034, 11100002, 'trivedi', 'khushi', 'surshbhai', '/amts/images/128_128/35.jpg', '2000-12-20', '8/janpath soc,paldi,ahmedabad', 380051, 'female', 'scince', '2015-2016', '9271837223'),
(26260035, 11100002, 'mandeliya', 'pratap', 'kanubhai', '/amts/images/128_128/36.jpg', '2000-12-20', '8/janpath soc,paldi,ahmedabad', 380051, 'male', 'scince', '2015-2016', '9271837223'),
(26260036, 11100002, 'prajapati', 'nirja', 'bhupendrabhai', '/amts/images/128_128/37.jpg', '2000-12-08', '8/janpath soc,paldi,ahmedabad', 380051, 'female', 'scince', '2015-2016', '9271843343'),
(26260037, 11100002, 'prajapati', 'nirja', 'bhupendrabhai', '/amts/images/128_128/38.jpg', '2000-12-20', '8/janpath soc,paldi,ahmedabad', 380051, 'female', 'scince', '2015-2016', '9271837223'),
(26260038, 11100002, 'kothari', 'niraj', 'kashyapbhai', '/amts/images/128_128/39.jpg', '2000-12-20', '8/janpath soc,paldi,ahmedabad', 380051, 'male', 'scince', '2015-2016', '9271837223'),
(26260039, 11100002, 'pandit', 'sachee', 'laljibahi', '/amts/images/128_128/40.jpg', '2000-12-20', '8/janpath soc,paldi,ahmedabad', 380051, 'female', 'scince', '2015-2016', '9271837223'),
(26260040, 11100002, 'thakkar', 'jayesh', 'vikashbhai', '/amts/images/128_128/41.jpg', '2000-12-20', '8/janpath soc,paldi,ahmedabad', 380051, 'male', 'scince', '2015-2016', '9271837223'),
(26260042, 11100002, 'joshi', 'sneha', 'jayendrabhai', '/amts/images/128_128/42.jpg', '2000-07-11', '8/j,jamunanagars,vadaj,ahmedabad', 380051, 'male', 'scince', '2015-2016', '8971837223'),
(262600041, 11100002, 'thakkar', 'anuj', 'kamleshkumar', '/amts/images/128_128/43.jpg', '2000-04-18', '7/rajapath banglow,vatva,ahmedabad', 380050, 'male', 'commerce', '2015-2016', '9271837233');

-- --------------------------------------------------------

--
-- Table structure for table `voter_card`
--

CREATE TABLE IF NOT EXISTS `voter_card` (
  `voter_id` bigint(10) NOT NULL,
  `f_name` varchar(15) NOT NULL,
  `m_name` varchar(15) NOT NULL,
  `l_name` varchar(15) NOT NULL,
  `dob` date NOT NULL,
  `adress` varchar(80) NOT NULL,
  `pincode` int(6) NOT NULL,
  `gen` varchar(6) NOT NULL,
  `pic` varchar(60) NOT NULL,
  `contact_no` varchar(10) NOT NULL,
  `mail_id` varchar(30) NOT NULL,
  PRIMARY KEY (`voter_id`),
  UNIQUE KEY `voter_id` (`voter_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `voter_card`
--

INSERT INTO `voter_card` (`voter_id`, `f_name`, `m_name`, `l_name`, `dob`, `adress`, `pincode`, `gen`, `pic`, `contact_no`, `mail_id`) VALUES
(1000000001, 'patel', 'viral', 'bharat bhai', '1996-03-12', '23,shreeji park,\r\nghodasar,ahmedabad', 380045, 'male', '/amts/images/128_128/1.jpg', '9726014875', 'viralpatel92@hotmail.com'),
(1000000002, 'prajapati', 'deepak', 'pratap bhai', '1955-11-03', '175,dharmbhoomi soc,\r\nghodasar,ahmdabad', 380050, 'male', '/amts/images/128_128/44.jpg', '9586301757', 'deepakprajapati589@gmail.com'),
(1000000003, 'patel', 'darshan', 'pratap bhai', '1996-01-26', '23,vrundavan soc,\r\nnigam,\r\nghodasar-amedabad', 380050, 'male', '/amts/images/128_128/3.jpg', '9601140078', 'darshan26@gmail.com'),
(1000000004, 'chauhan', 'vijay', 'jayesh bhai', '1995-10-24', '15,sarthsk apartment,\r\nnigam,\r\nghodasar,ahmedabad', 380050, 'male', '/amts/images/128_128/4.jpg', '8513647523', 'vijaybabau@yahoo.com'),
(1000000005, 'rami', 'vatsal', 'hitesh bhai', '0151-09-15', '2-b,akksah flats,\r\nnaroda,ahmedabad', 380175, 'male', '/amts/images/128_128/5.jpg', '9586472615', 'vatsalrami@gmail.com'),
(1000000006, 'thakkar', 'jayes', 'vikashbhai', '2000-09-14', 'v-5/janpath soc,ranip,ahmedabad', 380175, 'male', '/amts/images/128_128/6.jpg', '9271837223', 'Jayesh@gmail.com'),
(1000000007, 'mandeliya', 'pratap', 'kanubhai', '2000-05-17', '8/janpath soc,paldi,ahmedabad', 380175, 'male', '/amts/images/128_128/7.jpg', '9271563434', 'mandeliyaa@gmail.com'),
(1000000008, 'trivedi', 'khushi', 'surshbhai', '1999-12-17', '232b/vadilalnagar,paldi,ahmedabad', 380175, 'male', '/amts/images/128_128/8.jpg', '9271837223', 'khushitrivedi@gmail.com'),
(1000000009, 'prikh', 'narendra', 'divyeshbahi', '1999-05-07', '232b/vadilalnagar,paldi,ahmedabad', 380175, 'male', '/amts/images/128_128/9.jpg', '9271837223', 'narendraparikh@gmail.com'),
(1000000010, 'dave', 'kinju', 'dipenkumar', '1992-10-06', '6-c/bhavani soc,chandranagar,ahmedabad', 380175, 'female', '/amts/images/128_128/10.jpg', '9271837223', 'kinjudave@gmail.com'),
(1000000011, 'prikh', 'narendra', 'divyeshbahi', '1999-05-07', '232b/vadilalnagar,paldi,ahmedabad', 380175, 'male', '/amts/images/128_128/11.jpg', '9271837223', 'narendraparikh@gmail.com'),
(1000000012, 'shah', 'drashti', 'niravbhai', '2000-04-05', '23/bhagvan nagar,paldi,ahmedabad', 380175, 'female', '/amts/images/128_128/12.jpg', '9271837223', 'drshtishah@gmail.com'),
(1000000013, 'trivedi', 'manoj', 'nileshbhai', '2001-02-11', '45/jogeshvari soc,paldi,ahmedabad', 380175, 'male', '/amts/images/128_128/13.jpg', '9271837223', 'trivedmanoj@gmail.com'),
(1000000014, 'patel', 'sneh', 'mitbhai', '2001-06-14', '12/sarswati banglows,vasna,ahmedaba', 380175, 'male', '/amts/images/128_128/14.jpg', '9556778706', 'snehpatela@gmail.com'),
(1000000015, 'pandit', 'jaya', 'neelbhai', '2000-12-20', '8/tirthay flat,vadaj,ahmedabad', 380175, 'female', '/amts/images/128_128/15.jpg', '8967898789', 'panditjaya@gmail.com'),
(1000000016, 'vaghela', 'viajy', 'neelbhai', '1952-08-16', 'b-5/maheshvari soc,narol,ahmedabad', 380175, 'male', '/amts/images/128_128/16.jpg', '8937283728', 'vaghelavijay262@gmail.com'),
(1000000017, 'vaghela', 'viajy', 'neelbhai', '2000-08-16', 'b-5/maheshvari soc,narol,ahmedabad', 380175, 'male', '/amts/images/128_128/17.jpg', '9271837555', '@gmail.com'),
(1000000018, 'pandya', 'sanjay', 'jighneshbhai', '1991-06-14', '10/agamnigam soc,isanpur,ahmedabad', 380175, 'male', '/amts/images/128_128/17.jpg', '8888837223', 'sanjay@gmail.com'),
(1000000019, 'vaghela', 'jaydeep', 'vijaybhai', '2001-03-08', 'c-8/rajpath soc,paldi,ahmedabad', 380175, 'male', '/amts/images/128_128/18.jpg', '7771837223', 'jaydeepvijay@gmail.com'),
(1000000020, 'pandit', 'ayesh', 'aybhai', '1999-09-08', 'b-4/jogeshvari soc,jasoda,ahmedabad', 380175, 'male', '/amts/images/128_128/19.jpg', '9262383223', 'ayesh@gmail.com'),
(1000000021, 'patel', 'deep', 'nishitbhai', '1990-05-02', '18/vishvakarma soc,narol,ahmedabad', 380175, 'male', '/amts/images/128_128/20.jpg', '9271838294', 'deeph@gmail.com'),
(1000000022, 'raval', 'sanjana', 'nileshbhai', '1999-07-09', '8/vikasharth soc,narol,ahmedabad', 380051, 'female', '/amts/images/128_128/21.jpg', '789897289', 'sanjana@gmail.com'),
(1000000023, 'joshi', 'vinod', 'jayendrabhai', '2000-12-20', '18/j vidhyanagar,ahmedabad', 380175, 'male', '/amts/images/128_128/21.jpg', '926667223', 'vinodjoshi@gmail.com'),
(1000000024, 'patel', 'akash', 'nileshbhai', '2000-11-10', '10/ratnadeep soc,ghodasar,ahmedabad', 380175, 'male', '/amts/images/128_128/22.jpg', '9999837223', 'akash@gmail.com'),
(1000000025, 'patel', 'jay ', 'vikashbhai', '1990-10-03', '28/radhavallabh soc,paldi,ahmedabad', 380175, 'male', '/amts/images/128_128/23.jpg', '9271846464', 'jaykumar@gmail.com'),
(1000000026, 'thakkar', 'anuj', 'kamleshbhai', '2000-03-17', '7/rajapath banglow,vatva,ahmedabad', 380175, 'male', '/amts/images/128_128/24.jpg', '7773333723', 'thakkar@gmail.com'),
(1000000027, 'pandya', 'tapu', 'kalubhai', '2000-06-25', 'b-10/maheshvari soc,jivaraj,ahmedabadx', 380050, 'male', '/amts/images/128_128/25.jpg', '8777837233', 'tapupandya@gmail.com'),
(1000000028, 'joshi', 'bharat', 'bharatbhai', '2000-03-02', '12/sarswati banglows,ranip,ahmedabad', 380175, 'male', '/amts/images/128_128/26.jpg', '929999223', 'bharatjoshi11@gmail.com'),
(1000000029, 'patel', 'atithya', 'alkeshbhai', '1999-08-04', '8/janpath soc.,banglow,bapunagar,ahmedabad\r\n', 380175, 'male', '/amts/images/128_128/26.jpg', '999937223', 'atithya45@gmail.com'),
(1000000030, 'dave', 'kinjal', 'dilipbhai', '1999-06-06', '8/tirthay flat,kalupur,ahmedabad', 380175, 'female', '/amts/images/128_128/27.jpg', '7888787223', 'kinjal_dave@gmail.com'),
(1000000031, 'prikh', 'vinay', 'neeleshbhai', '1949-10-16', '175,dharmbhoomi soc,\r\nmemnagar,ahmdabad', 380175, 'male', '/amts/images/128_128/28.jpg', '9271837223', 'vinay111@gmail.com'),
(1000000032, 'pandya ', ' vishvesh', 'shaileshbai', '2000-12-20', '2-narayan nagar,navarangpura,ahmedabad', 380050, 'male', '/amts/images/128_128/29.jpg', '998787289', 'vishvesh222@gmail.com'),
(1000000033, 'vyash ', 'anil', 'priteshbhai', '1996-06-19', 'A215 ishvarnagar,sarkhej,ahmedabad', 380175, 'male', '/amts/images/128_128/30.jpg', '8888899833', 'anilvyash@gmail.com'),
(1000000034, 'chauhan', 'krunal', 'virendrabhai', '2001-03-08', '33 arpan socit, narol ,ahmedabad', 380175, 'male', '/amts/images/128_128/31.jpg', '9999837223', 'krunal8772@gmail.com'),
(1000000035, 'varma', 'mak', 'vinodbhai', '2000-12-20', '11 siddharth soc,paldi,ahmedabad', 380009, 'male', '/amts/images/128_128/32.jpg', '9288257623', 'romeshvarma@gmail.com'),
(1000000036, 'vaghela', 'chirag', 'jatinbhai', '2000-08-16', 'v-5/janpath soc,ranip,ahmedabad', 380007, 'male', '/amts/images/128_128/36.jpg', '7763623722', 'chiragvaghela@gmail.com'),
(1000000037, 'patil ', 'kalpesh', 'pankajbhai', '1954-05-07', '9/b,radhavallabh soc, ghodasar\r\nvasna,ahmedabad', 382445, 'male', '/amts/images/128_128/37.jpg', '7786445675', 'kalpeshpatil866@yahoo.com'),
(1000000038, 'rami', 'harivadhan', 'anilkumar', '1999-08-05', '4 swaminarayan soc,choras gam,ahmedabad', 380175, 'male', '/amts/images/128_128/38.jpg', '9272227289', 'harivadhan456@gmail.com'),
(1000000039, 'joshi ', 'vishal', 'bavinbhai', '2001-02-11', 'n13 mahespati sco,punitnagar,ahmedabad', 380175, 'male', '/amts/images/128_128/39.jpg', '888899999', 'joshivishal@gmail.com'),
(1000000040, 'pandya', 'hitesh', 'virenbhai', '1950-03-08', 'v-5/janpath soc,ranip,ahmedabad ', 380175, 'male', '/amts/images/128_128/40.jpg', '9299222833', 'pandya0989@gmail.com');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
