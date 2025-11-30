  # 关于为存储库创建 codespace
  可以在 GitHub 上、Visual Studio Code 中或使用 GitHub CLI 创建代码空间。  

  可以在个人 GitHub 帐户上使用 GitHub Codespaces，其中免费版和专业版计划中的帐户包含每月免费使用配额。   

  如果要启动新项目，建议通过模板创建 codespace 并稍后将其发布到 GitHub 上的仓库。  

  如果从存储库创建 codespace，该 codespace 将与不能为空的特定分支相关联。 每个仓库甚至每个分支可创建多个代码空间。  

  可以在“你的 codespace”页面上查看创建的每个可用代码空间。 若要显示此页面，请在 GitHub 的左上角，选择 ，然后单击“ Codespaces”。 这会转到 [github.com/codespaces](https://github.com/codespaces)。  

# codespace 创建过程
  创建代码空间时，需要执行一些步骤并将您连接到开发环境。  

  - 第 1 步：虚拟机和存储被分配到您的代码空间。
  - 第 2 步：创建容器并克隆仓库。
  - 第 3 步：您可以连接到代码空间.
  - 第 4 步：代码空间继续创建后设置。

  如果要对 codespace 使用 Git 挂钩，则应使用 devcontainer.json 生命周期脚本（如 postCreateCommand）设置挂钩。 这些操作在上面的步骤 4 中执行。  
  由于在克隆仓库之后创建了 codespace 的 dev 容器，因此在 dev 容器映像中配置的任何 git 模板目录将不适用于你的 codespace。 在创建代码空间后，必须改为安装挂钩。  
  
# 为存储库创建 codespace
  1. 在 GitHub 上，导航到存储库的主页面。
  2. 在存储库名称下，选择标有当前分支名称的分支下拉菜单，然后单击要为其创建 codespace 的分支。
  3. 单击“ Code”按钮，然后单击“Codespaces”选项卡,对话框底部会显示一条消息，告知谁将为 codespace 付费。
     <img width="852" height="900" alt="image" src="https://github.com/user-attachments/assets/7aa38837-c4b9-4940-9743-aef3612c0af1" />

  4. 使用默认选项或在配置高级选项之后创建 codespace：
     - 使用默认选项
       若要使用默认选项创建 codespace，请单击 `+`。
     - 配置高级选项
       若要配置 codespace 高级选项（例如其他计算机类型或特定 devcontainer.json 文件），请执行以下操作：  
       a. 在“Codespaces”选项卡的右上角，选择  并单击“使用选项新建” 。
         <img width="1111" height="1054" alt="image" src="https://github.com/user-attachments/assets/34b80165-90b3-48f0-8a56-48d4e33fe94d" />

       b. 在 codespace 选项页上，从下拉菜单中选择首选选项
         <img width="1440" height="1001" alt="image" src="https://github.com/user-attachments/assets/26838a0f-e295-4fa0-b875-213c31ccfd2e" />

  > [!NOTE]
  > - 可以为选项页添加书签，以便快速创建此存储库和分支的 codespace。  
  > - [https://github.com/codespaces/new](https://github.com/codespaces/new) 页提供了为任何存储库和分支创建 codespace 的快速方法。  
  >   可以通过在浏览器的地址栏中输入 `codespace.new` 来快速访问此页面。  
  > - 有关计算机类型的详细信息，请参阅 [更改代码空间的计算机类型](https://docs.github.com/zh/codespaces/customizing-your-codespace/changing-the-machine-type-for-your-codespace#about-machine-types)。  
  > - 你选择的可用计算机类型可能会受到多种因素的限制。 其中可能包括为组织配置的策略，或者存储库的计算机类型最低规范  
  >   有关详细信息，请参阅 [限制对计算机类型的访问](https://docs.github.com/zh/codespaces/managing-codespaces-for-your-organization/restricting-access-to-machine-types)
  >   和 [为代码空间计算机设置最低规范](https://docs.github.com/zh/codespaces/setting-up-your-project-for-codespaces/configuring-dev-containers/setting-a-minimum-specification-for-codespace-machines)

# 建议的机密
  创建 codespace 时，用户定义机密的名称可能会显示在高级选项页上。   
  如果在所选的开发容器配置中指定了建议的机密，则会发生这种情况。  
  有关详细信息，请参阅“[为存储库指定建议的机密](https://docs.github.com/zh/codespaces/setting-up-your-project-for-codespaces/configuring-dev-containers/specifying-recommended-secrets-for-a-repository)”。  

  <img width="1440" height="1847" alt="image" src="https://github.com/user-attachments/assets/ced5ec4c-724f-43d7-8aa3-1dd964d17615" />

  当系统提示输入这些开发环境机密的值时，建议输入这些机密的值，因为项目可能需要这些机密的值。  
  但是，创建 codespace 不需要提供值。 如果愿意，可以在 codespace 中设置这些机密。  

  如果为建议的机密输入值，该机密将在新的 codespace 中可用。   
  单击“创建 codespace”时，该机密也会添加到 Codespaces 的个人设置中，因此以后在为此存储库创建 codespace 时，无需为该机密输入值。
  
  如果显示机密名称时带有一个无法选择的复选框，并且没有输入框，这是因为你已在 Codespaces 的个人设置中配置了此名称的机密，并且已将其与此存储库相关联。  
  如果已创建此名称的机密，但尚未将其与此存储库关联，则可以选择该复选框，这样就可以更新设置来添加关联。  

  如果要更改预选机密的值，可以在 github.com/settings/codespaces 从 Codespaces 的个人设置中执行此操作。  
  有关详细信息，请参阅“[管理 GitHub Codespaces 特定于帐户的机密](https://docs.github.com/zh/codespaces/managing-your-codespaces/managing-your-account-specific-secrets-for-github-codespaces)”。  
