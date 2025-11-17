GitHub Codespaces 是一个基于云的即时开发环境，它使用容器为你提供用于开发的通用语言、工具和实用程序。  
GitHub Codespaces 也是可配置的，通过它可为项目创建自定义的开发环境。  
通过为项目配置自定义开发环境，可以为项目的所有用户提供可重复的代码空间配置。  

# 创建代码空间
  有许多入口点可用于创建代码空间。  
  - 通过 GitHub 模板或 GitHub 上的任何模板存储库启动新项目
  - 使用存储库中的分支进行新功能工作
  - 使用打开的拉取请求探索正在进行的工作
  - 使用存储库历史记录中的提交项调查特定时间点的 bug。

  可以在 GitHub 上、Visual Studio Code 中或使用 GitHub CLI 创建代码空间。  
  如果需要测试某些内容，则代码空间可以是短暂的，或者可以返回到同一代码空间来处理长时间运行的功能工作。  

  有关详细信息，请参阅 [为存储库创建 codespace](https://docs.github.com/zh/codespaces/developing-in-a-codespace/creating-a-codespace-for-a-repository)、  
  [通过模板创建 codespace](https://docs.github.com/zh/codespaces/developing-in-a-codespace/creating-a-codespace-from-a-template)，  
  以及 [打开现有 codespace](https://docs.github.com/zh/codespaces/developing-in-a-codespace/opening-an-existing-codespace)。
  > [!note]   
  > 每个仓库甚至每个分支可创建多个代码空间。 但是，可以创建的 codespace 数量和可以同时运行的 codespace 数量受到限制。  
  > 如果达到最大 codespace 数并尝试创建另一个 codespace，则会显示一条消息，告知你必须删除现有 codespace，然后才能创建新的 codespace。

# codespace 创建过程
  创建 codespace 时，各个步骤将在后台执行，然后 codespace 可供你使用。  

## 步骤 1：将虚拟机和存储分配给代码空间
  创建 codespace 时，将使用 VM 主机映像的稳定版本或 公共预览版 版本创建虚拟机 (VM)。  
  主机映像定义了用于创建 VM 的 Linux 版本。 VM 既是你专用的，也是你专属的。 拥有专用虚拟机可确保您拥有该计算机中可供使用的整个计算资源集。  
  如有必要，这还允许您对容器具有完全根访问权限。  

  然后会创建仓库的[浅克隆](https://github.blog/2020-12-21-get-up-to-speed-with-partial-clone-and-shallow-clone/)，如果是通过模板创建 codespace，则将创建模板仓库的浅克隆。  
  这会克隆到 VM 的 /workspaces 目录中，随后装载到开发容器中。 有关详细信息，请参阅下面的[关于 codespace 的目录结构](https://docs.github.com/zh/codespaces/about-codespaces/deep-dive#about-the-directory-structure-of-a-codespace)。  
  
## 步骤 2：创建开发容器
  GitHub Codespaces 使用 Docker 容器作为开发环境。 此容器是根据你可以在 devcontainer.json 文件以及 Dockerfile（可选）中定义的配置创建的。  
  如果通过 GitHub 的空白模板或不包含 devcontainer.json 文件的存储库创建 codespace，GitHub Codespaces 将使用具有多种语言和运行时的默认映像。   
  有关详细信息，请参阅“[开发容器简介](https://docs.github.com/zh/codespaces/setting-up-your-project-for-codespaces/adding-a-dev-container-configuration/introduction-to-dev-containers)”。   
  要详细了解默认开发容器映像包含的内容，请参阅 [`devcontainers/images`](https://github.com/devcontainers/images/tree/main/src/universal) 仓库。  
  > [!note]
  > 如果要在 codespace 中使用 Git 挂钩，并将 [git 模板目录](https://git-scm.com/docs/git-init#_template_directory)
  > 中的任何内容应用于 codespace，则必须在创建容器后在步骤 4 中设置挂钩。
  >
  > 由于存储库在创建容器之前已克隆到主机 VM 上，因此 git 模板目录中的任何内容都不会应用于 codespace，
  > 除非你在步骤 4 中使用 postCreateCommand 在 devcontainer.json 配置文件中设置挂钩。 有关详细信息，请参阅步骤 4：创建后设置。  

##  步骤 3：连接到代码空间
  创建容器并运行任何其他初始化后，您将连接到代码空间。 可以使用以下方法建立连接：  
  - Web 浏览器
  - Visual Studio Code
  - GitHub CLI

## 步骤 4：创建后设置
  连接到 codespace 后，你的自动设置可能会根据你在 `devcontainer.json `文件中指定的配置继续构建。   
  你可能会看到 `postCreateCommand` 和 `postAttachCommand` 运行  

  如果要在 codespace 中使用 Git 挂钩，请使用` devcontainer.json` 生命周期脚本设置挂钩，例如 postCreateCommand。  

  如果你有一个用于 GitHub Codespaces 的公共 dotfile 存储库，则可以启用它以用于新的 codespace。   
  启用后，您的 dotfile 将被克隆到容器中，并且将调用安装脚本。  
  有关详细信息，请参阅“[个性化你帐户的 GitHub Codespaces](https://docs.github.com/zh/codespaces/setting-your-user-preferences/personalizing-github-codespaces-for-your-account#dotfiles)”。  
  
  最后，如果通过存储库创建了 codespace，则会使用完整克隆复制存储库的整个历史记录。   
  如果通过模板创建了 codespace，则不会保留模板存储库的完整历史记录；除非改为使用空白模板，否则将从模板存储库内容的初始提交开始。  
  
  在创建后设置期间，您仍然可以使用集成终端并对文件进行编辑，但要注意避免工作与正在运行的命令之间存在任何争用条件。  
  




