# 关于代码空间的生命周期
  代码空间的生命周期从创建代码空间时开始，到删除代码空间时结束。 您可以断开连接并重新连接到活动代码空间，而不会影响其正在运行的进程。  
  您可以停止并重新启动代码空间，而不会丢失对项目所做的更改。  

# 创建 codespace
  当您要处理项目时，可以选择创建新代码空间或打开现有代码空间。   
  你可能希望每次在 GitHub Codespaces 中开发时从存储库的分支创建新的 codespace，或者为功能保留长时间运行的 codespace。   
  如果要启动新项目，建议通过模板创建 codespace 并稍后将其发布到 GitHub 上的仓库。  

  可以创建的 codespace 数量和可以同时运行的 codespace 数量受到限制。 这些限制因多种因素而异。   
  如果达到最大 codespace 数并尝试创建另一个 codespace，则会显示一条消息，告知你必须删除现有 codespace，然后才能创建新的 codespace。   
  同样，如果达到最大活动 codespace 数并尝试启动另一个活动 codespace，系统将提示你停止其中一个活动 codespace。  

  如果选择在每次处理项目时都创建新的代码空间，则应定期推送更改，以便任何新提交都位于 GitHub 上。   
  如果选择对项目使用长时间运行的代码空间，则每次开始在代码空间中工作时，都应从存储库的默认分支中提取代码空间，以便您的环境具有最新的提交。  
  此工作流程与在本地计算机上处理项目时非常相似。  

#  在代码空间中保存更改
  当您通过 Web 连接到代码空间时，将自动为 Web 编辑器启用自动保存，并配置为在延迟后保存更改。   
  当您通过桌面上运行的 Visual Studio Code 连接到代码空间时，必须启用自动保存。   

  你的工作将保存在云中的虚拟机上。 可以关闭和停止 codespace，稍后返回到保存的工作。 如果您有未保存的更改，编辑器将在退出之前提示您保存这些更改。  
  但是，如果 codespace 被删除，则你的工作也会被删除。   
  本地工作时若要持久保存工作，需要提交更改并将其推送到远程存储库，或者将工作发布到新的远程存储库（如果从模板创建 codespace）。   
  有关详细信息，请参阅“[在代码空间中使用源控制](https://docs.github.com/zh/codespaces/developing-in-a-codespace/using-source-control-in-your-codespace)”。   

# GitHub Codespaces 超时
  如果使代码空间在没有交互的情况下保持运行状态，或者退出代码空间而不显式停止它，则代码空间将在一段时间不活动后超时并停止运行。  
  默认情况下，代码空间将在处于非活动状态 30 分钟后超时，但您可以自定义所创建的新代码空间的超时期限的持续时间。   
  有关为 codespace 设置默认超时期限的详细信息，请参阅 [设置 GitHub Codespaces 超时期限](https://docs.github.com/zh/codespaces/setting-your-user-preferences/setting-your-timeout-period-for-github-codespaces)。   
  
  当代码空间超时时，将保留上次保存更改时的数据。  

# 重建代码空间
  可以重新生成 codespace 来实施你对开发容器配置做出的更改。 对于大多数使用，可以创建新的代码空间作为重新构建代码空间的替代方法。  
  默认情况下，重新生成 codespace 时，GitHub Codespaces 将重复使用缓存中的映像，以加快重新生成过程。   
  或者，可以执行完全重新生成，以清除缓存并使用新映像重新生成容器。  

  > [!NOTE]  
  > 在 codespace 中重新生成容器时，在` /workspaces` 目录之外所做的更改将被清除。
  >  在` /workspaces` 目录中所做的更改（包括从中创建 codespace 的存储库或模板的克隆）将在重新生成过程中得到保留。
  >  有关详细信息，请参阅“[深入了解 GitHub Codespaces](https://docs.github.com/zh/codespaces/about-codespaces/deep-dive#about-the-directory-structure-of-a-codespace)”。

# 停止代码空间
  您可以随时停止代码空间。 停止 codespace 后，将停止所有正在运行的进程。   
  下次启动代码空间时，代码空间中的任何已保存更改仍将可用。 终端历史记录会保留，但终端窗口的可见内容不会在 codespace 会话之间保留。  

  如果未明确停止代码空间，它将继续运行，直到它因非活动而超时。  
  关闭 codespace 不会停止 codespace。  
  例如，如果你在 VS Code Web 客户端中使用 codespace，并且关闭了浏览器选项卡，则 codespace 仍在远程计算机上保持运行。   

  只有运行的 codespace 才会产生 CPU 费用。 停止的 codespace 仅产生存储成本。  

  您可能希望停止并重新启动代码空间以对其应用更改。 例如，如果更改用于代码空间的计算机类型，则需要停止并重新启动它才能使更改生效。   
  您还可以停止代码空间，并在遇到错误或意外情况时选择重新启动或删除它。  

# 删除代码空间
  您可以为特定任务创建代码空间，然后在将更改推送到远程分支后安全地删除该代码空间。  
  
  如果您尝试删除包含未填充 git 提交的代码空间，编辑器将通知您有尚未推送到远程分支的更改。   
  您可以推送任何所需的更改，然后删除代码空间，或继续删除代码空间和任何未提交的更改。  
  还可以将代码导出到新分支，而无需创建新的代码空间。 有关详细信息，请参阅“[将更改导出到分支](https://docs.github.com/zh/codespaces/troubleshooting/exporting-changes-to-a-branch)”。  
  
  将自动删除已停止并在指定时间段内保持非活动状态的 codespace。   
  默认情况下，非活动 codespace 在 30 天后删除，但你可以自定义 codespace 保持期。   
  有关详细信息，请参阅“[配置 codespace 的自动删除](https://docs.github.com/zh/codespaces/setting-your-user-preferences/configuring-automatic-deletion-of-your-codespaces)”。  
  
# 使用 GitHub Codespaces 时丢失连接
  GitHub Codespaces 是一个基于云的开发环境，需要连接 Internet。 如果您在代码空间中工作时失去互联网连接，您将无法访问代码空间。  
  但是，任何未提交的更改将保存。 当您再次接入互联网时，可以按离开时完全相同的状态连接到代码空间。   
  如果您的互联网连接不稳定，则应经常提交并推送更改。  

  如果知道自己会经常脱机工作，则可以使用扩展名为“[Dev Containers](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers)”的 devcontainer.json 文件，以便 VS Code 生成并附加到存储库的本地开发容器。  
   有关详细信息，请参阅 Visual Studio Code 文档中的[在容器内开发](https://code.visualstudio.com/docs/remote/containers)。  
   
