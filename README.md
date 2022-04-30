# Scala Kata Starter Code

This repository contains starter code for attempting a Scala kata exercise.

It assumes that you have Java, Scala and Scala Build Tool (SBT) installed.

If you haven't yet installed these, it's worth following the instructions on the Scala refresh exercises regarding Scala setup and installation

https://github.com/techreturners/scala_coding_exercises

## Instructions

To utilise this starter code

### 1. Create a new folder on your computer that will house the starter code.

For example if you are working on a bowling game kata, using the command line you would do:

```
mkdir bowling-game-kata
```

### 2. Change to the directory and pull this code

Next navigate to that directory and `git pull` this code

```
cd bowling-game-kata
```

Initialise git

```
git init
```

And then pull the starter code

```
git pull https://github.com/techreturners/lm-code-kata-scala-starter.git
```

Once the code has been pulled then rename the branch to **main**

```
git branch -M main
```

### 3. Open up GitHub.com and create a new repository

Go to GitHub.com and create a new repository.

Give the repository a name - suggest naming the repository the same name as your folder

Make sure it is **Public**

Then leave everything else as blank. So do NOT create a README, GitIgnore or Licence.

Click **Create repository**

### 4. Copy URL of new repository

You should then see a screen telling you how to push to the repository.

Copy the URL of the repository. For example if a user called **pluto** had created a repository called **bowling-game-kata** then the URL would be:

https://github.com/pluto/bowling-game-kata.git

### 5. Push starter code back to repository

Then back on your computer whilst within your newly created directory. 

Configure your GitHub origin server (for where you will be pushing code back to)

```
git remote add origin URL_YOU_COPIED
```

Replacing the **URL_YOU_COPIED** with the correct URL. For example:

```
git remote add origin https://github.com/pluto/bowling-game-kata.git
```

Now you can push the code to your repository

```
git push -u origin main
```

### 6. Utilise repository as normal

Now you can continue to utilise the repository as normal, commmiting and pushing as normal.


