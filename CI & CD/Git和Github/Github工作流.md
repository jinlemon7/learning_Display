# 存储库  repository选项卡
  1. 新建repository  
     <img width="732" height="516" alt="image" src="https://github.com/user-attachments/assets/d85fbd82-f3bb-4661-a941-b2a1d811c305" />  
  2. 键入存储库名称
  3. 键入说明
  4. 选择public/private
  5. 添加README文件

# 创建独立分支 （让协作者独立，不影响main分支地进行自己的工作）
  默认main分支为最终分支  
  从main分支创建分支时创建的是main在当时的副本或快照  
    <img width="1440" height="362" alt="image" src="https://github.com/user-attachments/assets/e61288d9-25ba-490e-aa15-a31a7568b463" />

  1. 存储库的code选项卡
  2. 文件列表上方，单击main下拉菜单
     <img width="760" height="344" alt="image" src="https://github.com/user-attachments/assets/02e188fb-c3a3-47c5-8143-e52f04440af7" />
  3. 键入分支名称

# 进行/提交更改  （形成change单元）
  每个提交都是一个孤立、完整的更改，以便于合并拉取请求后恢复更改。  
  1. 单击commit change选项卡
  2. 键入更改说明

# 创建拉取请求  pull requests选项卡
  打开拉取请求后，可以提出更改，要求某人审查和提取您的贡献并将其合并到其分支中。   
  拉取请求非常重要，某些仓库需要批准审查才能合并拉取请求。  
  拉取请求显示两个分支中内容的差异。 变化、增减以不同的颜色显示。  

  1. pull requests选项卡
  2. new pull request
  3. 查看更改，确认提交
     <img width="1434" height="516" alt="image" src="https://github.com/user-attachments/assets/cec26069-b2e0-4b8e-8fca-e920ac61a1c8" />
  4. create pull request选项卡
  5. 键入pull request说明

# 审查拉取请求  pull requests->Files changed->Review changes选项卡
  组织所有者和存储库管理员（即具有仓库读取权限的团队）可以限制谁能够批准pull request审查或请求更改pull request  
  
  审查3种状态：  
  1. 注释：只提供一般反馈
  2. 批准：比准合并change
  3. 请求更改：提出要解决的问题  （不会阻止merge，除非保护规则配置“要求pull request”选项）

  PS：即使拉取请求尚未获得批准的审核，存储库所有者和管理员也可以合并拉取请求。  

  pull requests选项卡中Conversation选项卡显示收到的所有审查，此处可以关闭审查。  
  对pull request做实质修改后，在中Conversation选项卡单击循环图标进行重新请求审核。  

# 合并拉取请求  pull requests->Conversation->merge pull request选项卡
  拉取请求可能会引入与父分支上的现有代码冲突的代码更改，GitHub 将提醒你有关冲突代码的信息，并防止合并，直到冲突解决为止。  

  1. 在pull requests选项卡底部单击merge pull request选项卡
  2. 单击confirm merge选项卡

# 删除分支  pull requests->Conversation->Delete branch选项卡
  拉取请求和提交记录不会被删除，如有必要，随时恢复已删除分支/拉取请求。  

  1. Delete brabch选项卡
    
