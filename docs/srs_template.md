
# Spades Multi 
### Software Requirements Specification
   Version 1.0 approved\
   Prepared by:\
   DeJon Mitchell and Parrish Hinton\
   Western Illinois University\
   10/09/22

## Table of Contents
[Revision History](#revision-history)
1. [Introduction](#1-introduction)\
  1.1 [Purpose](#11-purpose)\
  1.2 [Document Conventions](#12-document-conventions)\
  1.3 [Intended Audience and Reading Suggestions](#13-intended-audience-and-reading-suggestions)\
  1.4 [Project Scope](#14-project-scope)\
  1.5 [References](#15-references)
2. [Overall Description](#2-overall-description)\
  2.1 [Product Perspective](#21-product-perspective)\
  2.2 [Product Features](#22-product-features)\
  2.3 [User Classes and Characteristics](#23-user-classes-and-characteristics)\
  2.4 [Operating Environment](#24-operating-environment)\
  2.5 [Design and Implementation Constraints](#25-design-and-implementation-constraints)\
  2.6 [User Documentation](#26-user-documentation)\
  2.7 [Assumptions and Dependencies](#27-assumptions-and-dependencies)
3. [System Features](#3-system-features)\
	3.1 [System Feature 1](#31-system-feature-1)\
	3.2 [System Feature 2 (and so on)](#32-system-feature-2-and-so-on)
4. [External Interface Requirements](#4-external-interface-requirements)\
	4.1 [User Interfaces](#41-user-interfaces)\
	4.2 [Hardware Interfaces](#42-hardware-interfaces)\
	4.3 [Software Interfaces](#43-software-interfaces)\
	4.4 [Communications Interfaces](#44-communications-interfaces)
5. [Other Nonfunctional Requirements](#5-other-nonfunctional-requirements)\
	5.1 [Performance Requirements](#51-performance-requirements)\
	5.2 [Safety Requirements](#52-safety-requirements)\
	5.3 [Security Requirements](#53-security-requirements)\
	5.4 [Software Quality Attributes](#54-software-quality-attributes)
6. [Other Requirements](#6-other-requirements)

Appendix A: [Glossary](#appendix-a-glossary)\
Appendix B: [Analysis Models](#appendix-b-analysis-models)\
Appendix C: [Issues List](#appendix-c-issues-list)

## Revision History

| Name   | Date   | Reason For Changes   | Version   |
| ------ | ------ | -------------------- | --------- |
|        |        |                      |           |
|        |        |                      |           |


## 1. Introduction
Invented in the United States in the 1930s, Spades remains one of the most popular trick-taking card games. With this game you will be able to play with friends or play alone. the obejct is to take at least the number of tricks(also known as "books") that were bidded before the games begins. In partnership Spades, the bids and tricks taken are combined in total scores to decide a winner.

### 1.1 Purpose

In order to initiate a card game there are multiple steps in the overall procedure beforehand. You must first find four players, which is time consuming going against your time limited window of opportunity to play. Second a pair of standard 52 cards deck is required and oftentimes there is a missing card or the paper cards have deteriorated over time from constant usage and bad card placement. Through “Spades Multi” we provide a realistic card game experience online without having to actually physically come in contact with each player individually or keeping track and taking care of the deck of cards.

### 1.2 Document Conventions

A brief overview of the plan for creating this Spades project was to simply construct and enforce the rules of the spades game which players will be bounded by while delivering the spades gameplay experience. The foundation of how this game will be created is critically outlined from each angle steming from the Graphical user interface down to the source code throughout this documentation.

### 1.3 Intended Audience and Reading Suggestions

The target audience for “Spades multi” is intended for but not limited to low-to-upper class consumers whose age range from (13+)

### 1.4 Project Scope

The overall scope of project "spades" is to implement a fully functional single/multiplayer spades game with a design in such that an online multiplayer feature will also be compatible. 

### 1.5 References

1) Wikipedia
2) www.w3schools.com

## 2. Overall Description

Number of players\
Two or more; the game is most commonly played with four players in pairs ("Partnership spades")\
The deck\
Standard 52-card deck. Spades may also be played with one or two Jokers or with predetermined cards removed. With playing with six or more players, a second deck is often used.\
Rank of suit\
Spades are always trump. Other suits have no intrinsic value during play, but a card of the suit led in the current trick will beat a card of any other suit except a Spade. If a tiebreaker is needed in a draw for deal, the most common suit order in Bridge from low to high is ♣ ♦ ♥ ♠.\
Rank of cards\
Highest to lowest: Ace, King, Queen, Jack, 10, 9, 8, 7, 6, 5, 4, 3, 2.\
Object of the game\
To score points (generally 500). Points are accrued by winning at least the number of tricks bid in each hand, and are lost by failing to take at least that many, or in some cases by taking too many.\

### 2.1 Product Perspective

Our product is designed for competitive players and casual players who want to improve on their play style or just have fun. Without the headache of playing the game in real life.

### 2.2 Product Features

Start - Create teams and starts game\
Deal - Shuffle cards and deal them\
Card select - selects the card that user would like to play

### 2.3 User Classes and Characteristics

Active User Classes: Deal, Play Card, Bid (Nil/Blind nil).
Active Game Class: Start, Shuffle, Score update, Total Score, End round.  

### 2.4 Operating Environment

* All data is generated on the loacl computer inside a java session 
* All data is accessed locally 
* Countinuous access to teh sazme computer for the duration of a game 

### 2.5 Design and Implementation Constraints

Requires JRE 6.0 or Higher installed on a computer running Spades.

platform Constraint: 

* PC with windows 7, Windows XP, Mac OS X, or Ubuntu 9.10 installed\
* 1.6GHz or higher processor 
* 1 gigbyte or more of memory installed
* 50 megabytes or more of avalible disk space 

### 2.6 User Documentation

(Example user Manual) Disclaimer: Do not own copyrights | Intended for example display purposes ONLY!
http://cab.spbu.ru/files/release3.13.0/manual.html 

User manual applicants: Parrish Hinton, DeJon Mitchell 
Contact information pj-hinton@wiu.edu, d-mitchell@wiu.edu
### 2.7 Assumptions and Dependencies

No external factor dependacies, no reusage of another project or program, and no 3rd party commercial components will be used.

## 3. System Features

* Deal 
* Bid
* Play Card 

### 3.1. Deal

Deal class - will shuffle cards and deal them to each player 

#### 3.1.1 Description and Priority

Deal class is high priority and will shuffle and deal cards to all players without deal class there will be no start to the game  

#### 3.1.2 Stimulus/Response Sequences

the user will simply press deal button and the game will start 

#### 3.1.3 Functional Requirements

REQ-1:user must press buttton 

REQ-2:round must be at a end

REQ-3: leader must be chosen 

### 3.2 Bid

Bid class - will allow user to bid how many books they will win 

#### 3.2.1 Description and Priority

Bid class is high priority and will allow for teh score of the game to be updated

#### 3.2.2 Stimulus/Response Sequences

the user will simply press blind nil or see cards and then choose a number of books they believe that they will win 

#### 3.2.3 Functional Requirements

REQ-1:user must press buttton 

REQ-2:round must be at the start 

### 3.3 play card

play card class - will allow user to select whic card they will liek ot play 

#### 3.2.1 Description and Priority

play card class is high priority becuase the users will play cards and then the score will be updated after every player plays a card 

#### 3.2.2 Stimulus/Response Sequences

the user will simply press teh crad they will like to play 

#### 3.2.3 Functional Requirements

REQ-1:user must press buttton 

REQ-2:round must be users turn 

## 4. External Interface Requirements

### 4.1 User Interfaces

The Graphic User Interface within the Spades software has a start prompt screen which operates and initiates through mouse click progressing to the spades play screen where the game is began and orchastrated also through mouse click.

### 4.2 Hardware Interfaces

* Mouse and Keyboard I/O
- Mouse and Keyboard are the primary peripherial hardware components for user interaction within the systems software.  

### 4.3 Software Interfaces

Mac OS 10 or greater\
Windows operating system (Windows 7+)\
Netbeans\
Java

### 4.4 Communications Interfaces

The local Spades gameplay will not offere any player-to-player or player-to-cpu communication.

## 5. Other Nonfunctional Requirements

### 5.1 Performance Requirements

* PC with windows 7, Windows XP, Mac OS X, or Ubuntu 9.10 installed\
* 1.6GHz or higher processor 
* 1 gigbyte or more of memory installed
* 50 megabytes or more of avalible disk space 

### 5.2 Safety Requirements

User should take mulitple breaks while using program.\
Consectuive usage may cause addictive symptoms.

### 5.3 Security Requirements

Our program will not modify or create any files that will be installed on the computer\
There will be no communication over the internet or local network 

### 5.4 Software Quality Attributes

* Accessibility
* accuracy
* mobility
* precison
* producibility
* responsive 
* stability

## 6. Other Requirements

This Program doesnt contain specifics database securence external to the program but recyclaility within the code is general foundation of the programs database alongside with proper code wash and cleansing before reaching the database. 

## Appendix A: Glossary

Graphical User Interface (GIU)
Input/Output (I/O)
Java Run-time Envioronment (JRE)
Players may pass cards in partnership before the start of a hand (Card Passing)
Software Requirements Specification (SRS) 

## Appendix B: Analysis Models

| Model/Diagram in parent folder |

## Appendix C: Issues List

* Graphic User Interface
* Code Implementation
* Infrastructure
