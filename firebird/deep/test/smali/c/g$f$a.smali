.class public Lc/g$f$a;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/g$f;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lc/g$f;


# direct methods
.method public constructor <init>(Lc/g$f;)V
    .locals 0

    iput-object p1, p0, Lc/g$f$a;->a:Lc/g$f;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lc/g$f$a;->a:Lc/g$f;

    invoke-virtual {p1}, Lc/g$f;->d()V

    return-void
.end method
