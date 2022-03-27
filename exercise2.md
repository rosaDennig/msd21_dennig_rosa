
### Git Commands


###SETUP
####Configuring user information used across all local repositories

```

* git config --global user.name “[firstname lastname]”

set a name that is identifiable for credit when review version history

* git config --global user.email “[valid-email]”

set an email address that will be associated with each history marker

```
These commands are used at the beginning when you are setting up a new account.


### SETUP & INIT
#### configuring user information, initializing and cloning repositories

```

* git init

initialize an existing directory as a Git repository

* git clone [url]

retrieve an entire repository from a hosted location via URL

```

These commands are used to initialise and clone new repositories, working directories.

### STAGE & SNAPSHOT
#### Working with snapshots and the Git staging area

```

* git status

show modified files in working directory, staged for your next commit

* git add [file]

add a file as it looks now to your next commit (stage)

* git reset [file]

unstage a file while retaining the changes in working directory

* git diff

diff of what is changed but not staged

* git commit -m “[descriptive message]”

commit your staged content as a new commit snapshot

```
First a new file is added to the staging area then you can commit it.
Commit means the new files and file changes in the staging area will be added to the local repository.
The local commits can be sent to the server with the git push  command.

### INSPECT & COMPARE
#### Examining logs, diffs and object information

```

* git log

show the commit history for the currently active branch

```

###SHARE & UPDATE

#### Retrieving updates from another repository and updating local repos

```

* git push [alias] [branch]

Transmit local branch commits to the remote repository branch

* git pull

fetch and merge any commits from the tracking remote branch

```
### HELP
#### Get help on git commands

```

* git command --help

```

