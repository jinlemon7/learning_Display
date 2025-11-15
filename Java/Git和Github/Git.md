  跟踪和管理文件更改的版本控制系统（Version Control System）  
  
  分布式版本控制系统（Distributed Version Control System），每个开发人员都有项目和项目历史记录的完整副本。  
  与集中式版本控制系统不同，DVCS不需要与中央存储库的持续连接。  
  开发人员可以查看项目历史记录，找出：  
  1. 进行了哪些更改。  
  2. 谁进行了更改。  
  3. 何时进行了更改。  
  4. 为什么需要更改。

# 仓库
  存储库或Git项目包含关联的文件和文件夹的整个集合，以及每个文件的修订历史记录。  
  文件历史记录在时间上显示为快照，称为提交（commit）。  
  Git存储库允许与历史记录交互、克隆存储库、创建分支、提交、合并、比较不同版本的代码更改等。  

# 命令行
## 基本Git命令
  git init 初始化一个Git存储库（添加一个隐藏的子文件夹，包含版本控制所需的数据结构）  
  git clone 克隆远程项目  
  git add 暂存更改，保存更改的快照，将成为写一个快照的一部分，但并未保存到历史记录。  
  git commit 将快照保存到项目历史记录，`git add`暂存的内容都将成为`git commit`快照的一部分。  
  git status 将更改的状态显示出来：未跟踪（Untracked，文件在Working Directory）、已修改（Modified，文件在Working Directory）、  
                                  已暂存（Staged，`git add`文件在Staging Area）、已提交（Commited，`Git commit`后文件在本地Repository）。  
  git branch 显示正在本地处理的分支。  
  git merge 将开发现合并。  
  git pull 使用远程对应项的更新来更新本地开发线。  
  git push 使用本地对分支的更改提交来更新远程存储库。  
## 3种使用情况 (针对Windows)
### 参与现有仓库
  1. git clone https://github.com/owner/repo.git  #`owner/repo`只是示例，需替换  
  2. cd repo  
  3. git branch my-branch  
  4. git checkout my-branch   #切换分支
  5. git add file1.md file2.md
  6. git commit -m "my snapshot"    #  `-m` 添加提交说明
  7. git push --set-upstram origin my-branch  #  `--set-upsteam` 上传修改后分支
                                              #  `origin` 远程存储库名称，需替换
### 启动新的存储库
  前提：在github上创建一个新库，不要添加、README、gitignore、License来初始化。   
  
  1. git init my-repo  
  2. cd my-repo  
  3. touch READ.md            # 创建文件  
  4. git add READ.md  
  5. git commit -m "add READ to initial commit"  
  6. git remote add origin https://github.com/YOUR-USERNAME/YOUR-REPOSITORY-NAME.git  # `remove add` 添加远程库（名称+URL）  
  7. git push --set-upstream origin main  
### 为Github上现有分支工作
  前提：已有本地项目，且新分支已push到Github
  
  1. cd repo
  2. git pull
  3. git checkout feature-a
  4. git add file1.md
  5. git commit -m "edit file1"
  6. git push








