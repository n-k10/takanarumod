# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 21: エフェクトとポーションを追加しよう

このステップでは、カスタムエフェクト「銀の視覚」と、それを付与するポーションを追加します。
醸造台で奇妙なポーション+銀インゴットから作れます。

### やること
- `SilverSightEffect.java` を作成する（MobEffectを拡張、発光効果を毎tick付与）
- `ModEffects.java` を作成してエフェクトを登録する
- `ModPotions.java` を作成してポーションを登録する
- `TakanaruMod.java` に登録を追加し、醸造レシピを設定する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/effect/SilverSightEffect.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/effect/ModEffects.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/potion/ModPotions.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/TakanaruMod.java` | 編集 |
| `src/main/resources/assets/takanarumod/lang/en_us.json` | 編集 |
| `src/main/resources/assets/takanarumod/lang/ja_jp.json` | 編集 |

### テクスチャ
このステップでは新しいテクスチャは不要です。
