# 概念
  GitHub 结合了用于格式化文字的语法，称为 GitHub Flavored Markdown，具有一些独特的写作功能。  
  Markdown 是一种易于读取和编写的语言，用于设置纯文本格式。  
  我们添加了一些自定义功能来创建 GitHub Flavored Markdown，用于格式化网站中的散文和代码。  

# 标题
  要创建标题，请在标题文本前添加一到六个 # 符号。# 符号的数量将决定标题的层级和字体大小。  
  ```
  # A first-level heading
  ## A second-level heading
  ### A third-level heading
  ```
  <img width="1334" height="388" alt="image" src="https://github.com/user-attachments/assets/75f579b0-9078-4d08-b78c-7d980eeaa17e" />

  当您使用两个或多个标题时，GitHub 会自动生成目录，您可以通过点击文件头访问该目录。目录中会列出每个标题，您可以点击标题跳转到相应部分。  
  
  <img width="1440" height="598" alt="image" src="https://github.com/user-attachments/assets/d72e6d15-0d30-421d-b9ab-baae56e88f25" />

# 链接
  您可以通过将链接文本用方括号 [ ] 包裹，然后将 URL 用圆括号 ( ) 包裹来创建内联链接。您也可以使用快捷键 Ctrl + K 创建链接。选中文本后，您可以从剪贴板粘贴 URL，即可自动从所选内容创建链接。
  您还可以通过选中文本并使用键盘快捷键 ctrl + V 来创建 Markdown 超链接。如果您想将文本替换为链接，请使用键盘快捷键 Ctrl + Shift + V 。
  ```
  This site was built using [GitHub Pages](https://pages.github.com/).
  ```
  <img width="1408" height="84" alt="image" src="https://github.com/user-attachments/assets/04afda5d-42ab-4e81-888d-f67a45fe2987" />

  当评论中输入有效的 URL 时，GitHub 会自动创建链接。

# 章节连接
  您可以直接链接到任何带有标题的章节。要查看渲染文件中自动生成的链接（锚点），请将鼠标悬停在章节标题上以显示图标，然后单击该图标即可在浏览器中显示链接。  
  <img width="1440" height="558" alt="image" src="https://github.com/user-attachments/assets/23c22c1a-b9e3-4d05-9fb6-e8e8950c49d5" />

  片段：URI（统一资源标识符） 的片段标识符组件允许通过引用主资源和其他标识信息来间接识别辅助资源。被识别的辅助资源可以是主资源的某个部分或子集，也可以是主资源的某种表示形式，  
        或者是由这些表示形式定义或描述的其他资源。片段标识符组件以井号（“#”）字符表示，并以 URI 的末尾结尾。  
  
  如果您需要确定正在编辑的文件中标题的锚点，可以使用以下基本规则：  
  - 字母全部转换为小写。  
  - 空格将被替换为连字符（ - ）。其他任何空白字符或标点符号都将被删除。  
  - 删除前导和尾随空格。  
  - 标记格式被移除，只留下内容（例如， _italics_ 变为 italics ）。  
  - 如果自动生成的标题锚点与同一文档中较早的锚点相同，则通过附加连字符和自增整数来生成唯一标识符。  

  下面的代码块演示了从渲染内容中的标题生成锚点的基本规则。  
  ```
  # Example headings

  ## Sample Section
  
  ## This'll be a _Helpful_ Section About the Greek Letter Θ!
  A heading containing characters not allowed in fragments, UTF-8 characters, two consecutive spaces between the first and second words, and formatting.
  
  ## This heading is not unique in the file
  
  TEXT 1
  
  ## This heading is not unique in the file
  
  TEXT 2
  
  # Links to the example headings above
  
  Link to the sample section: [Link Text](#sample-section).
  
  Link to the helpful section: [Link Text](#thisll-be-a-helpful-section-about-the-greek-letter-Θ).
  
  Link to the first non-unique section: [Link Text](#this-heading-is-not-unique-in-the-file).
  
  Link to the second non-unique section: [Link Text](#this-heading-is-not-unique-in-the-file-1).
  ```
  如果您编辑标题，或者更改具有“相同”锚点的标题的顺序，则还需要更新指向这些标题的任何链接，因为锚点会发生变化。  

# 相对链接
  您可以在渲染的文件中定义相对链接和图像路径，以帮助读者导航到存储库中的其他文件。  
  相对链接是指相对于当前文件的链接。例如，如果你的仓库根目录下有一个 README 文件，而 docs/CONTRIBUTING.md 目录下还有一个文件，那么 README 文件中指向 CONTRIBUTING.md 的相对链接可能如下所示：  
  ```
  [Contribution guidelines for this project](docs/CONTRIBUTING.md)
  ```
  GitHub 会根据你当前所在的分支自动转换相对链接或图片路径，以确保链接或路径始终有效。链接路径将相对于当前文件。以 / 开头的链接将相对于仓库根目录。你可以使用所有相对链接操作符，例如 ./ 和 ../ 。  
  链接文本应该写在一行上。下面的示例将无法正常工作。  
  ```
  [Contribution
  guidelines for this project](docs/CONTRIBUTING.md)
  ```
  对于克隆您仓库的用户来说，相对链接更方便。绝对链接在克隆的仓库中可能无法正常工作——我们建议使用相对链接来引用仓库内的其他文件。

# 自定义锚点
  您可以使用标准的 HTML 锚点标签（ `<a name="unique-anchor-name"></a>` ）为文档中的任何位置创建导航锚点。为避免歧义，请为锚点标签使用唯一的命名方案，例如在 name 属性值前添加前缀。  
  自定义锚点将不会包含在文档大纲/目录中。  
  您可以使用为锚点指定的 name 属性值来链接到自定义锚点。语法与链接到为标题自动生成的锚点时完全相同。 
  
  例如：  
  ```
  # Section Heading

  Some body text of this section.
  
  <a name="my-custom-anchor-point"></a>
  Some text I want to provide a direct link to, but which doesn't have its own heading.
  
  (… more content…)
  
  [A link to that custom anchor](#my-custom-anchor-point)
  ```
  自动标题链接的自动命名和编号行为不会考虑自定义锚点。

# 图片
  您可以通过添加 ! 并将 alt 文本用 [ ] 包裹来显示图像。alt 文本是图像信息的简短文本版本。然后，将图像链接用括号 () 包裹起来。  
  ```
  ![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.]
  (https://myoctocat.com/assets/images/base-octocat.svg)
  ```
  <img width="949" height="748" alt="image" src="https://github.com/user-attachments/assets/c0195cb2-a998-438d-90aa-0f1e4e5f35ec" />

  GitHub 支持在 issue、pull request、讨论、评论和 .md 文件中嵌入图片。您可以显示仓库中的图片、添加在线图片的链接或上传图片。  
  
  当您想要显示存储库中的图像时，请使用相对链接而不是绝对链接。  
  以下是一些使用相对链接显示图像的示例。  
  | 语境 | 相对链接 |  
  | 在同一分支上的 .md 文件中 | /assets/images/electrocat.png |  
  | 在另一个分支的 .md 文件中 | /../main/assets/images/electrocat.png |  
  | 在仓库的 issue、pull request 和评论中 | ../blob/main/assets/images/electrocat.png?raw=true |  
  上表中的最后两个相对链接仅适用于查看者至少拥有对包含这些图像的私有存储库的读取权限的私有存储库中的图像。

# 图片元素
  支持 <picture> HTML 元素。
  ```html
  <img width="" height="" alt="" src="" />
  ```
  ```html
  <picture>
  #示例使用的是相对链接
   <source media="(prefers-color-scheme: dark)" srcset="贴图-防失效/benti-convert.png">
   <source media="(prefers-color-scheme: light)" srcset="贴图-防失效/benti.png">
   <img alt="受支持头像" src="贴图-防失效/benti.png">
  </picture>
  ```

# 表格
## 创建表  
  可以使用竖线 | 和连字符 - 创建表。 连字符用于创建每列的标题，而竖线用于分隔每列。 必须在表格前包含空白链接，以便其正确呈现。  
  ```
  | First Header  | Second Header |
  | ------------- | ------------- |
  | Content Cell  | Content Cell  |
  | Content Cell  | Content Cell  |
  ```
  <img width="1248" height="304" alt="image" src="https://github.com/user-attachments/assets/9f44adae-dfbe-4791-9a26-c74f73d067a8" />

  表格末尾的竖线可选。  
  单元格的宽度可以不同，无需在列内准确对齐。 标题行的第一列中必须至少有三个横线。  
  ```
  | Command | Description |
  | --- | --- |
  | git status | List all new or modified files |
  | git diff | Show file differences that haven't been staged |
  ```
  <img width="1248" height="302" alt="image" src="https://github.com/user-attachments/assets/754f69c8-7122-4803-9418-f75a4c7e25dd" />

  如果经常编辑代码片段和表，则可能受益于在 GitHub 上启用对所有注释字段采用固定宽度字体。  
## 格式化表格中的内容
  可以在表格中使用格式，例如链接、内联代码块和文本样式：  
  ```
  | Command | Description |
  | --- | --- |
  | `git status` | List all *new or modified* files |
  | `git diff` | Show file differences that **haven't been** staged |
  ```
  <img width="1248" height="296" alt="image" src="https://github.com/user-attachments/assets/04583953-3496-4310-990f-9c167e0147b8" />

  可以通过在标题行中连字符的左侧、右侧或两侧添加冒号 :，来靠左、靠右或居中对齐列中的文本。  
  ```
  | Left-aligned | Center-aligned | Right-aligned |
  | :---         |     :---:      |          ---: |
  | git status   | git status     | git status    |
  | git diff     | git diff       | git diff      |
  ```
  <img width="1248" height="296" alt="image" src="https://github.com/user-attachments/assets/759d8a56-513c-4b1c-8a91-0da676b5362a" />

  若要包含竖线 | 作为单元格中的内容，请在竖线前使用 \：  
  ```
  | Name     | Character |
  | ---      | ---       |
  | Backtick | `         |
  | Pipe     | \|        |
  ```
  <img width="1248" height="302" alt="image" src="https://github.com/user-attachments/assets/22f54beb-7fa0-4577-95d6-676e818f1803" />

# 列表
  您可以通过在一行或多行文本前面加上 - 、 * 或 + 来创建一个无序列表。
  ```
  - George Washington
  * John Adams
  + Thomas Jefferson
  ```
  <img width="1440" height="234" alt="image" src="https://github.com/user-attachments/assets/af23d4ca-e7de-4b5b-968f-04a989b12258" />

  要对列表进行排序，请在每一行前面加上数字。  
  ```
  1. James Madison
  2. James Monroe
  3. John Quincy Adams
  ```
  <img width="1440" height="236" alt="image" src="https://github.com/user-attachments/assets/85fb18be-5bf0-42d8-89cb-63aeb8d43f31" />

# 嵌套列表
  你可以通过将一个或多个列表项缩进到另一个列表项下方来创建嵌套列表。  
  要在 GitHub 的网页编辑器或使用等宽字体的文本编辑器（例如 Visual Studio Code） 中创建嵌套列表，您可以对列表进行视觉对齐。  
  在嵌套列表项前面输入空格，直到列表标记字符（ - 或 * ）正好位于其上方列表项文本的第一个字符下方。  
  ```
  1. First list item
   - First nested list item
     - Second nested list item
  ```
  在基于 Web 的编辑器中，您可以先突出显示所需的行，然后分别使用 Tab 或 Shift + Tab 来缩进或取消缩进一行或多行文本。  
  <img width="1440" height="163" alt="image" src="https://github.com/user-attachments/assets/4c0e8dcd-e0d1-41e4-bdbf-c776511256d4" />
  <img width="1440" height="195" alt="image" src="https://github.com/user-attachments/assets/4f7152c6-01e7-48ac-9b27-28f9dfc0b216" />

  要在 GitHub 的评论编辑器中创建嵌套列表（该编辑器未使用等宽字体），您可以查看嵌套列表上方的列表项，并计算其内容前面的字符数。然后在嵌套列表项前面输入相同数量的空格字符。

# 任务清单
  要创建任务列表，请在列表项前加上连字符和空格，然后加上方括号 [ ] 。要将任务标记为已完成，请使用 [x] 。  
  ```
  - [x] #739
  - [ ] https://github.com/octo-org/octo-repo/issues/740
  - [ ] Add delight to the experience when all tasks are complete :tada:
  ```
  <img width="1440" height="169" alt="image" src="https://github.com/user-attachments/assets/fcd0d2e6-f007-49c0-bb01-f460a79934a7" />
  
  如果任务列表项描述以括号开头，则需要使用 \ 对其进行转义：  
  `- [ ] \(Optional) Open a followup issu`

# 换行符
  如果你在代码仓库中编写问题、拉取请求或讨论，GitHub 会自动添加换行符：  
  ```
  This example
  Will span two lines
  ```
  但是，如果您在 .md 文件中编写内容，上面的示例将显示在一行上，不会换行。要在 .md 文件中创建换行符，您需要添加以下代码之一：  
  - 第一行末尾加两个空格。
  - 在第一行末尾添加反斜杠。
    ```
    This example\
    Will span two lines
    ```
  - 在第一行末尾添加一个 HTML 单行换行符标签。
    ```
    This example<br/>
    Will span two lines
    ```
  如果在两行之间留一个空行，那么无论是 .md 文件还是 issue、pull request 和讨论中的 Markdown，都会将这两行渲染成由空行分隔开来：   
  ```
  This example
  
  Will have a blank line separating both lines
  ```

# 段落
  您可以通过在文本行之间留空一行来创建新段落。

# 脚注
  您可以使用以下括号语法向内容中添加脚注：  
  ```
  Here is a simple footnote[^1].

  A footnote can also have multiple lines[^2].
  
  [^1]: My reference.
  [^2]: To add line breaks within a footnote, add 2 spaces to the end of a line.  
  This is a second line.
  ```
  <img width="1440" height="413" alt="image" src="https://github.com/user-attachments/assets/d923f2cd-6b5a-4044-8911-e80f7da9de09" />

  Markdown 中脚注的位置不会影响其最终的渲染位置。您可以在引用脚注之后直接添加脚注，它仍然会显示在 Markdown 的底部。Wiki 不支持脚注。  

# 警报
  警示语 （有时也称为标注或提示 ）是基于引用块语法的 Markdown 扩展，可用于强调关键信息。在 GitHub 上，它们会以不同的颜色和图标显示，以表明内容的重要性。  
  仅在对用户成功至关重要时才使用提示框，并且每篇文章最多使用一到两个，以免给读者造成信息过载。此外，应避免连续放置提示框。提示框不能嵌套在其他元素中。  
  
  要添加警报，请使用特殊的 blockquote 行指定警报类型，后跟标准 blockquote 中的警报信息。共有五种警报类型：  
  ```
  > [!NOTE]
  > Useful information that users should know, even when skimming content.
  
  > [!TIP]
  > Helpful advice for doing things better or more easily.
  
  > [!IMPORTANT]
  > Key information users need to know to achieve their goal.
  
  > [!WARNING]
  > Urgent info that needs immediate user attention to avoid problems.
  
  > [!CAUTION]
  > Advises about risks or negative outcomes of certain actions.
  ```
  <img width="1440" height="909" alt="image" src="https://github.com/user-attachments/assets/99c7ffcc-8f85-481d-a6f3-5e46a7097b9a" />

# 文本样式
  您可以在注释字段和 .md 文件中使用粗体、斜体、删除线、下标或上标文本来表示强调。  

  | 风格 | 句法 | 键盘快捷键 | 例子 | 输出 | Github适用性 | 
  | --- | --- | --- | --- | --- | --- |
  | 加粗 | ** ** 或者 __ __ | Ctrl + B （Windows/Linux）| \*\*这是粗体文本\*\* | **这是粗体文本** | |
  | 斜体 | * * 或者 _ _ | Ctrl + I （Windows/Linux） | \_这段文字是斜体字\_ | _这段文字是斜体字_ | |
  | 删除线 | ~~ ~~ or ~ ~ | | \~\~这是错误的文本\~\~ | ~~这是错误的文本~~ | 不适用 |
  | 粗体和嵌套斜体 | ** ** 和 _ _ | | \*\*这段文字\_极其\_重要\*\* | **这段文字_极其_重要** | 不适用 |
  | 全部粗体和斜体 | *** *** | | \*\*\*所有这些文字都很重要\*\*\* | ***所有这些文字都很重要*** | |
  | 下标 | <sub> </sub> | | 这是\<sub> 下标\</sub>文本 |  这是<sub> 下标</sub>文本 | |
  | 上标 | <sup> </sup> | | 这是\<sup>上标\</sup>文本 | 这是<sup>上标</sup>文本 | |
  | 下划线 | <ins> </ins> | | 这是\<ins>下划线\</ins>文本 | 这是<ins>下划线</ins>文本 | 不适用 |

# 引用文本
  您可以使用 > 引用文本。  
  ```
  Text that is not a quote

  > Text that is a quote
  ```
  引用的文本左侧用竖线缩进，并以灰色字体显示。  
  
  <img width="1440" height="227" alt="image" src="https://github.com/user-attachments/assets/fd11b041-841a-406a-b803-f17cb2f71f8e" />

  查看对话时，您可以选中评论中的文本，然后输入 R 来自动引用该文本。您也可以点击 ，然后选择“引用回复” 来引用整个评论。

# 引用代码
  您可以使用单个反引号 (``) 在句子中引用代码或命令。反引号内的文本不会被格式化。  
  您也可以按 Ctrl + E （Windows/Linux）快捷键，在 Markdown 行中插入代码块的反引号。
  ```
  Use `git status` to list all new or modified files that haven't yet been committed.
  ```
  <img width="1200" height="78" alt="image" src="https://github.com/user-attachments/assets/2b55631f-7d12-47f9-8a7f-bc5164a7f099" />

  要将代码或文本格式化为单独的块，请使用三个反引号。  
  ```shell
    Some basic Git commands are:
    ``` 
    git status
    git add
    git commit
    ```
  ```
  
  <img width="1440" height="304" alt="image" src="https://github.com/user-attachments/assets/1d6e0759-bca9-49d7-8c19-7fb9fb93dd64" />

# 支持的颜色模型
  在问题、拉取请求和讨论中，您可以使用反引号在句子中指定颜色。反引号内支持的颜色模型将显示该颜色的可视化效果。  
  ```
  The background color is `#ffffff` for light mode and `#000000` for dark mode.
  ```
  <img width="1384" height="92" alt="image" src="https://github.com/user-attachments/assets/3616eccd-c62a-41a3-9f3b-4d85995eee7e" />

  以下是目前支持的颜色模型。
  | 颜色 | 句法 | 例子 | 输出 | 
  | --- | --- | --- | --- |  
  | HEX | \`#RRGGBB\` | \`#0969DA\` | <img width="136" height="38" alt="image" src="https://github.com/user-attachments/assets/8e238ffe-c411-4d6f-bb00-8b068449761a" />| 
  | RGB | \`rgb(R,G,B)\` | \`rgb(9, 105, 218)\` | <img width="254" height="38" alt="image" src="https://github.com/user-attachments/assets/60956cdc-ae63-4a1f-a117-88d8018eeba6" /> | 
  | HSL | \`hsl(H,S,L)\` | \`hsl(212, 92%, 45%)\` | <img width="280" height="38" alt="image" src="https://github.com/user-attachments/assets/7ecebeeb-0a80-4e52-8469-a9fc5997e41a" /> | 
  
  支持的颜色模型中，反引号内不能有任何前导空格或尾随空格。  
  颜色可视化功能仅在问题、拉取请求和讨论中受支持。 在.md文件中不支持。

# 创建和突显代码块
## 隔离代码块
  通过在代码块的前后输入三反引号 ```，可创建围栏代码块。 我们建议在代码块的前后各留一个空白行，使原始格式更易辨读。  
  ```
  function test() {
    console.log("notice the blank line before this function?");
  }
  ```
  <img width="1440" height="191" alt="image" src="https://github.com/user-attachments/assets/83199e3c-e433-486b-af17-86b82a44d768" />

  要在列表中保留格式，请确保将非围栏代码块缩进八个空格。  

  要在围栏代码块中显示三重倒引号，请将其包在四个倒引号内。  
  ````
  ```
  Look! You can see my backticks.
  ```
  ````
  <img width="1440" height="233" alt="image" src="https://github.com/user-attachments/assets/1976f222-c091-4af1-b72c-e3f162f58508" />

## 语法突出显示
  您可以添加可选的语言标识符，以在围栏代码块中启用语法突显。  
  语法突出显示功能会更改源代码的颜色和样式，使其更易于阅读。  

  例如，要语法突显 Ruby 代码：  
  ````
  ```ruby
  require 'redcarpet'
  markdown = Redcarpet.new("Hello World!")
  puts markdown.to_html
  ```
  ````
  <img width="1440" height="239" alt="image" src="https://github.com/user-attachments/assets/9571f4a4-e9cb-4f29-8a7e-9a1320d483b1" />

  当你创建一个围栏代码块并且还希望在 GitHub Pages 网站上突出显示语法时，请使用小写的语言标识符。   

  Github使用 [Linguist](https://github.com/github-linguist/linguist) 执行语言检测，并选择[第三方语法](https://github.com/github-linguist/linguist/blob/main/vendor/README.md) 
  以强调语法。 你可以在[语言 YAML 文件](https://github.com/github-linguist/linguist/blob/main/lib/linguist/languages.yml)中找出哪些关键字有效。
  
# 使用表情符号 
  您可以通过输入 `:EMOJICODE:` （冒号后跟表情符号的名称）来在文字中添加表情符号。  
  `@octocat :+1: This PR looks great - it's ready to merge! :shipit:`   
  <img width="1440" height="85" alt="image" src="https://github.com/user-attachments/assets/af1b416e-0a34-4891-a4ba-1b956c5deea7" />
  输入 : 将显示建议的表情符号列表。列表会随着您的输入进行筛选，因此找到所需的表情符号后，请按 Tab 键或 Enter 键完成高亮显示的结果。  
  有关可用表情符号和代码的完整列表，请参阅[表情符号速查表](https://github.com/ikatyang/emoji-cheat-sheet/blob/github-actions-auto-update/README.md) 。  

# 使用折叠部分组织信息
  可以通过创建读者可以选择展开的折叠部分来暂时隐藏 Markdown 的分区。 例如，当想在问题评论中包含可能不是每个读者都相关或感兴趣的技术细节时，可以将这些细节放在折叠部分中。    
  `<details>` 块中的任何 Markdown 都将被折叠，直到读者单击  展开详细信息。  
  在 `<details>` 块中，使用 `<summary>` 标记让读者知道里面的内容。 标签显示在  的右侧。  
  ```
    <details>
  
    <summary>Tips for collapsed sections</summary>
    
    ### You can add a header
    
    You can add text within a collapsed section.
    
    You can add an image or a code block, too.
    
    ```ruby
       puts "Hello World"
    ```
    
    </details>
  ```
  默认情况下，<summary> 标签中的 Markdown 将被折叠：  
  <img width="1440" height="72" alt="image" src="https://github.com/user-attachments/assets/122d2ec4-4f4c-45d9-9827-a4133301b3b0" />
  
  读者单击  后，将展开详细信息：  
  <img width="1440" height="603" alt="image" src="https://github.com/user-attachments/assets/4b7fa6f1-031d-460e-941b-081ee55b5370" />

  若要使该部分在默认情况下显示为打开状态，请将 open 属性添加到 `<details>` 标签：  
  `<details open>`
  
# 隐藏带评论的内容
  你可以通过将内容放在 HTML 注释中，告诉 GitHub 从渲染的 Markdown 中隐藏该内容。  
  `<!-- This content will not appear in the rendered Markdown -->`  

# 上传资产
  您可以通过拖放、从文件浏览器中选择或粘贴的方式上传图片等资源。  
  您可以将资源上传到代码仓库中的问题、拉取请求、评论和 .md 文件。

# 提及人员和团队
  GitHub 上，您可以通过输入 @ 加上用户名或团队名称来提及某人或团队 。这将触发通知，并引起他们的注意。如果您编辑评论并提及他们的用户名或团队名称，他们也会收到通知。  
  只有当某人对存储库具有读取权限，并且如果存储库属于某个组织，则该人必须是该组织的成员时，才会通知该人有关提及的信息。  
  `@github/support What do you think about these updates?` 
  <img width="1440" height="79" alt="image" src="https://github.com/user-attachments/assets/2520837e-3fd8-4d34-9c1b-cae7c676e25d" />

  当您提及父团队时，其子团队的成员也会收到通知，从而简化与多个群体之间的沟通。  
  输入 @ 符号将显示项目成员或团队列表。列表会随着您的输入自动筛选，因此找到您要查找的成员或团队名称后，您可以使用方向键选中它，  
  然后按 Tab 键或 Enter 键完成输入。对于团队，请输入 @组织/团队名称，该团队的所有成员都将订阅此对话。  
  自动补全结果仅限仓库协作者和该讨论串中的其他参与者查看。

# 引用问题和拉取请求
  输入 # 即可调出仓库中建议的问题和拉取请求列表。  
  输入问题或拉取请求的编号或标题来筛选列表，然后按 Tab 键或 Enter 键完成高亮显示的结果。  

# 忽略Markdown格式
  你可以通过在 Markdown 字符前使用 \ 来告诉 GitHub 忽略（或转义）Markdown 格式。  
  `Let's rename \*our-new-project\* to \*our-old-project\*.`  
  <img width="1440" height="75" alt="image" src="https://github.com/user-attachments/assets/ea1ccd20-c574-4d48-bdef-715e77f14f66" />

  在问题或拉取请求的标题中，Markdown 格式不会被忽略。  

# 禁用Markdown渲染
  查看 Markdown 文件时，您可以点击文件顶部的 “代码”按钮来禁用 Markdown 渲染，并改为查看文件的源代码。  
  禁用 Markdown 渲染后，您可以使用源代码视图功能，例如行链接，而查看已渲染的 Markdown 文件时无法使用这些功能。  

# 参考外部资源 
  如果为代码库配置了自定义自动链接引用，则指向外部资源（例如 JIRA 问题或 Zendesk 工单）的引用将转换为短链接。要了解代码库中可用的自动链接，请联系具有代码库管理员权限的人员。 
