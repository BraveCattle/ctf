.class public Lh/x0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lh/x0;


# direct methods
.method public constructor <init>(Lh/x0;)V
    .locals 0

    iput-object p1, p0, Lh/x0$a;->b:Lh/x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lh/x0$a;->b:Lh/x0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lh/x0;->d(Z)V

    return-void
.end method
