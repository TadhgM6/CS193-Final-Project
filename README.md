# CS193-Final-Project

Keeps track of practice time & consistency to help user improve in an easier-to-see way

## The Problem

It's easy to lose track of how consistently I practice my instrument. College only makes consistently practice more difficult. The problem compounds with multiple instruments & keeping up with all of them.

## How It Works

- User tells machine when they start or stop practicing, & what instrument they're practicing on
- Program measures time between inputs, keeps track of data
- When user requests it, gives data on average time practiced, average time this week, streak, longest streak / how long since last practice, weekly growth, etc

PUT THE DIAGRAM HERE ______-----______--------________-------
![System diagram](Downloads/SystemDiagram.png)

## Tech Stack

- **Language** Bash / Java
- **External Tools** cron

## Setup

```bash
git clone https://github.com/TadhgM6/CS193-Final-Project
cd CS193-Final-Project
./install.sh
```

## Usage
[] means it doesn't exist yet

- Run [/timer] command with argument [instrumentName] to start & stop timer
- If that instrument doesn't exist, pop up a prompt to add it, can also add it with [/addInstrument] command
- After timer stops, time practiced is put into [/times] file
- Run [/stats] to get aforementioned stats

## Roadmap

- [ ] Record & play audio
- [ ] Bully you into practicing more with notifications
- [ ] Tuner

## Author

Tadhg Mckiernan, [link github](https://github.com/TadhgM6)
