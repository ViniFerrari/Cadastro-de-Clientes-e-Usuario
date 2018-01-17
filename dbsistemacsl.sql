-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 25-Set-2017 às 22:28
-- Versão do servidor: 5.6.15-log
-- PHP Version: 5.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dbsistemacsl`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcliente`
--

CREATE TABLE IF NOT EXISTS `tbcliente` (
  `idcli` int(11) NOT NULL AUTO_INCREMENT,
  `nomecli` varchar(150) NOT NULL,
  `cpfcli` varchar(14) NOT NULL,
  `rgcli` varchar(10) NOT NULL,
  `logradourocli` varchar(200) NOT NULL,
  `numcli` int(11) NOT NULL,
  `bairrocli` varchar(80) NOT NULL,
  `cepcli` varchar(10) NOT NULL,
  `cidadecli` varchar(80) NOT NULL,
  `ufcli` varchar(2) NOT NULL,
  `celularcli` varchar(14) NOT NULL,
  `fonecli` varchar(13) NOT NULL,
  `emailcli` varchar(200) NOT NULL,
  PRIMARY KEY (`idcli`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Extraindo dados da tabela `tbcliente`
--

INSERT INTO `tbcliente` (`idcli`, `nomecli`, `cpfcli`, `rgcli`, `logradourocli`, `numcli`, `bairrocli`, `cepcli`, `cidadecli`, `ufcli`, `celularcli`, `fonecli`, `emailcli`) VALUES
(16, 'Vinicius', '04337596070', '11666631', 'Vinicius', 274, 'Pasqualini', '9322456', 'Sapucaia do Sul', 'RS', '51996930327', '5131119495', 'viniferrari1999@gmail.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(20) NOT NULL,
  `senha` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `login`, `senha`) VALUES
(1, 'vinicius', '123'),
(16, 'a', 'a');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
