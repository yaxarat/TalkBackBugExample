# Bug description
When a dialog fragment has a tool bar, with `imageView` with a click listner to perform certain action, the content description of the image view gets announced twice by TalkBack.

Example: `imageView` with listner to excucte `dialog.dismiss()` has a content description of "Back". TalkBack will announce "Back, Back Button" on the initial focus when the dialog is created.

# Expected behavior
TalkBack announces the content description only once.


## Reproduction steps using this sample app:
1. Open app with TalkBack toggled on.
2. Click "Launch Dialog Fragment" button
3. Listen as TalkBack announces the content description on imageView on the launched dialog fragment.
