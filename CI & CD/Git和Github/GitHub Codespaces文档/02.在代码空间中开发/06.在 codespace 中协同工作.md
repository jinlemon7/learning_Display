通过 Visual Studio Live Share，可在 codespace 中与他人实时协作编辑和调试。 可以安全地共享当前 codespace，或访问其他人创建的 codespace。  
可以在浏览器的 VS Code Web 客户端或 VS Code 桌面应用程序中启动 Live Share 会话。  

有关 Live Share 的更多信息，请在 Visual Studio 文档中查看什么是 [Visual Studio Live Share](https://learn.microsoft.com/en-us/visualstudio/liveshare/)？。  

# 与其他人共享 codespace
  1. 单击活动栏中的“扩展”图标。
  2. 在搜索框中，键入“Live Share”。
     <img width="1316" height="674" alt="image" src="https://github.com/user-attachments/assets/e635858a-73e9-4c86-b3a3-3123e3ae6c22" />

  3. 如果扩展旁边显示“安装”按钮，请单击它，在 codespace 中安装该扩展。
  4. 如果扩展在列表中呈灰显，请右键单击它，然后单击“启用”。
     <img width="1308" height="494" alt="image" src="https://github.com/user-attachments/assets/0e9711ec-583c-47bf-bc08-9042035ca36a" />

  5. 在活动栏中，单击“Live Share”图标。
     <img width="1312" height="586" alt="image" src="https://github.com/user-attachments/assets/2995c973-0407-4553-a133-d6c6d5dcefa4" />

  6. 单击“共享”。
     VS Code 右下角会显示一条“toast”通知消息，告知你已将指向 codespace 的链接复制到剪贴板。
     如果要阻止来宾更改你与其共享的文件，可单击“设为只读”。
     <img width="1290" height="340" alt="image" src="https://github.com/user-attachments/assets/aaa0a4e2-f4b2-45a6-8c90-e506253a0e14" />

  7. 将剪贴板中的链接发送给希望其加入你的 Live Share 会话的任何人。
  > [!IMPORTANT]  
  > 考虑到 Live Share 会话可为来宾提供的访问级别，只能与信任的人共享，并应充分考虑共享内容造成的影响。  
  >  有关详细信息，请参阅 Visual Studio 文档中的 [Live Share 的安全功能](https://learn.microsoft.com/en-us/visualstudio/liveshare/reference/security)。

# 停止 Live Share 会话
  若要停止共享 codespace，请单击“Live Share”面板中的“停止”图标。  
  <img width="1294" height="360" alt="image" src="https://github.com/user-attachments/assets/1aaa0d76-a8dd-4147-b6c1-fa3167e647c5" />  

  如果启动 Live Share 会话的人员关闭 codespace，则会话结束共享，即使 codespace 在远程主机上保持活动状态也是如此。  

  空闲超时在处于非活动状态一段时间后自动停止 codespace，且仅适用于启动 codespace 的用户。  
  它不适用于通过 Live Share 在 codespace 上工作的用户。  
  因此，如果启动 codespace 的用户在配置的时间段内保持非活动状态，则在协作者使用 codespace 时，codespace 可能会超时。  

# 在其他人的 codespace 中协同工作
  如果要与某人在其创建的 codespace 中协作，请让他们设置 Live Share 会话并向你发送一个链接，如上所述。  
