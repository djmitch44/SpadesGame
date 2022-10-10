
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
Invented in the United States in the 1930s, Spades remains one of the most popular trick-taking card games. This game allows players to play with friends or to play alone. The obejct is to take at least the number of tricks(also known as "books") that were bidded before the games begins. In partnership Spades, the bids and tricks taken are combined in totalality of scores to decide a winner.


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

\<Identify the various user classes that you anticipate will use this
product. User classes may be differentiated based on frequency of use,
subset of product functions used, technical expertise, security or
privilege levels, educational level, or experience. Describe the
pertinent characteristics of each user class. Certain requirements may
pertain only to certain user classes. Distinguish the favored user
classes from those who are less important to satisfy.\>

### 2.4 Operating Environment

\<Describe the environment in which the software will operate, including
the hardware platform, operating system and versions, and any other
software components or applications with which it must peacefully
coexist.\>

### 2.5 Design and Implementation Constraints

\<Describe any items or issues that will limit the options available to
the developers. These might include: corporate or regulatory policies;
hardware limitations (timing requirements, memory requirements);
interfaces to other applications; specific technologies, tools, and
databases to be used; parallel operations; language requirements;
communications protocols; security considerations; design conventions or
programming standards (for example, if the customer's organization will
be responsible for maintaining the delivered software).\>

### 2.6 User Documentation

\<List the user documentation components (such as user manuals, on-line
help, and tutorials) that will be delivered along with the software.
Identify any known user documentation delivery formats or standards.\>

### 2.7 Assumptions and Dependencies

\<List any assumed factors (as opposed to known facts) that could affect
the requirements stated in the SRS. These could include third-party or
commercial components that you plan to use, issues around the
development or operating environment, or constraints. The project could
be affected if these assumptions are incorrect, are not shared, or
change. Also identify any dependencies the project has on external
factors, such as software components that you intend to reuse from
another project, unless they are already documented elsewhere (for
example, in the vision and scope document or the project plan).\>

## 3. System Features

\<This template illustrates organizing the functional requirements for
the product by system features, the major services provided by the
product. You may prefer to organize this section by use case, mode of
operation, user class, object class, functional hierarchy, or
combinations of these, whatever makes the most logical sense for your
product.\>

### 3.1. System Feature 1

\<Don't really say "System Feature 1." State the feature name in just a
few words.\>

#### 3.1.1 Description and Priority

\<Provide a short description of the feature and indicate whether it is
of High, Medium, or Low priority. You could also include specific
priority component ratings, such as benefit, penalty, cost, and risk
(each rated on a relative scale from a low of 1 to a high of 9).\>

#### 3.1.2 Stimulus/Response Sequences

\<List the sequences of user actions and system responses that stimulate
the behavior defined for this feature. These will correspond to the
dialog elements associated with use cases.\>

#### 3.1.3 Functional Requirements

\<Itemize the detailed functional requirements associated with this
feature. These are the software capabilities that must be present in
order for the user to carry out the services provided by the feature, or
to execute the use case. Include how the product should respond to
anticipated error conditions or invalid inputs. Requirements should be
concise, complete, unambiguous, verifiable, and necessary. Use "TBD" as
a placeholder to indicate when necessary information is not yet
available.\>

\<Each requirement should be uniquely identified with a sequence number
or a meaningful tag of some kind.\>

REQ-1:

REQ-2:

### 3.2 System Feature 2 (and so on)

## 4. External Interface Requirements

### 4.1 User Interfaces

\<Describe the logical characteristics of each interface between the
software product and the users. This may include sample screen images,
any GUI standards or product family style guides that are to be
followed, screen layout constraints, standard buttons and functions
(e.g., help) that will appear on every screen, keyboard shortcuts, error
message display standards, and so on. Define the software components for
which a user interface is needed. Details of the user interface design
should be documented in a separate user interface specification.\>

### 4.2 Hardware Interfaces

\<Describe the logical and physical characteristics of each interface
between the software product and the hardware components of the system.
This may include the supported device types, the nature of the data and
control interactions between the software and the hardware, and
communication protocols to be used.\>

### 4.3 Software Interfaces

\<Describe the connections between this product and other specific
software components (name and version), including databases, operating
systems, tools, libraries, and integrated commercial components.
Identify the data items or messages coming into the system and going out
and describe the purpose of each. Describe the services needed and the
nature of communications. Refer to documents that describe detailed
application programming interface protocols. Identify data that will be
shared across software components. If the data sharing mechanism must be
implemented in a specific way (for example, use of a global data area in
a multitasking operating system), specify this as an implementation
constraint.\>

### 4.4 Communications Interfaces

\<Describe the requirements associated with any communications functions
required by this product, including e-mail, web browser, network server
communications protocols, electronic forms, and so on. Define any
pertinent message formatting. Identify any communication standards that
will be used, such as FTP or HTTP. Specify any communication security or
encryption issues, data transfer rates, and synchronization
mechanisms.\>

## 5. Other Nonfunctional Requirements

### 5.1 Performance Requirements

\<If there are performance requirements for the product under various
circumstances, state them here and explain their rationale, to help the
developers understand the intent and make suitable design choices.
Specify the timing relationships for real time systems. Make such
requirements as specific as possible. You may need to state performance
requirements for individual functional requirements or features.\>

### 5.2 Safety Requirements

\<Specify those requirements that are concerned with possible loss,
damage, or harm that could result from the use of the product. Define
any safeguards or actions that must be taken, as well as actions that
must be prevented. Refer to any external policies or regulations that
state safety issues that affect the product's design or use. Define any
safety certifications that must be satisfied.\>

### 5.3 Security Requirements

\<Specify any requirements regarding security or privacy issues
surrounding use of the product or protection of the data used or created
by the product. Define any user identity authentication requirements.
Refer to any external policies or regulations containing security issues
that affect the product. Define any security or privacy certifications
that must be satisfied.\>

### 5.4 Software Quality Attributes

\<Specify any additional quality characteristics for the product that
will be important to either the customers or the developers. Some to
consider are: adaptability, availability, correctness, flexibility,
interoperability, maintainability, portability, reliability,
reusability, robustness, testability, and usability. Write these to be
specific, quantitative, and verifiable when possible. At the least,
clarify the relative preferences for various attributes, such as ease of
use over ease of learning.\>

## 6. Other Requirements

\<Define any other requirements not covered elsewhere in the SRS. This
might include database requirements, internationalization requirements,
legal requirements, reuse objectives for the project, and so on. Add any
new sections that are pertinent to the project.\>

## Appendix A: Glossary

\<Define all the terms necessary to properly interpret the SRS,
including acronyms and abbreviations. You may wish to build a separate
glossary that spans multiple projects or the entire organization, and
just include terms specific to a single project in each SRS.\>

## Appendix B: Analysis Models

\<Optionally, include any pertinent analysis models, such as data flow
diagrams, class diagrams, state-transition diagrams, or
entity-relationship diagrams.\>

## Appendix C: Issues List

\< This is a dynamic list of the open requirements issues that remain to
be resolved, including TBDs, pending decisions, information that is
needed, conflicts awaiting resolution, and the like.\>
